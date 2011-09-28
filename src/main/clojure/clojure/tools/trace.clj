;;;
;;  trace.clj -- simple call-tracing macros for Clojure

;;  by Stuart Sierra, http://stuartsierra.com/
;;  December 3, 2008

;;  Copyright (c) Stuart Sierra, 2008. All rights reserved. The use
;;  and distribution terms for this software are covered by the Eclipse
;;  Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;;  which can be found in the file epl-v10.html at the root of this
;;  distribution. By using this software in any fashion, you are
;;  agreeing to be bound by the terms of this license. You must not
;;  remove this notice, or any other, from this software.
;;
;;  This file defines simple "tracing" macros to help you see what your
;;  code is doing.
;;
;;  CHANGE LOG
;;
;;  Sept 18, 2011: Luc Préfontaine
;;
;;  * moved it to new contrib modular struct
;;
;;  * made it 1.2/1.3 compliant
;;
;;  * supported doc strings
;;
;;  * added a trace-form macro, from Jonathan Fischer
;; 
;;  December 3, 2008:
;; 
;;  * replaced *trace-out* with tracer
;; 
;;  * made trace a function instead of a macro
;;  (suggestion from Stuart Halloway)
;; 
;;  * added trace-fn-call
;; 
;;  June 9, 2008: first version
;;;
(ns ^{:author "Stuart Sierra, Michel Salim, Luc Préfontaine, Jonathan Fischer Friberg"
      :doc "This file defines simple tracing macros to help you see what your code is doing."}
     clojure.tools.trace
  (:use [clojure.pprint]))

(def ^{:doc "Current stack depth of traced function calls." :dynamic true}
      *trace-depth* 0)

(def ^{:doc "Forms to ignore when tracing forms."}
      ignored-form? '#{def quote var try monitor-enter monitor-exit})

(defn ^{:private true} tracer
  "This function is called by trace. Prints to standard output, but
may be rebound to do anything you like. 'name' is optional."
  [name value]
  (println (str "TRACE" (when name (str " " name)) ": " value)))

(defn trace
  "Sends name (optional) and value to the tracer function, then
returns value. May be wrapped around any expression without
affecting the result."
  ([value] (trace nil value))
  ([name value]
     (tracer name (pr-str value))
     value))

(defn ^{:private true} trace-indent
  "Returns an indentation string based on *trace-depth*"
  []
  (apply str (take *trace-depth* (repeat "| "))))

(defn trace-fn-call
  "Traces a single call to a function f with args. 'name' is the
symbol name of the function."
  [name f args]
  (let [id (gensym "t")]
    (tracer id (str (trace-indent) (pr-str (cons name args))))
    (let [value (binding [*trace-depth* (inc *trace-depth*)]
                  (apply f args))]
      (tracer id (str (trace-indent) "=> " (pr-str value)))
      value)))

(defmacro deftrace
  "Use in place of defn; traces each call/return of this fn, including
   arguments. Nested calls to deftrace'd functions will print a
   tree-like structure.
   The first argument of the form definition can be a doc string"
  [name & definition]
  (let [doc-string (if (string? (first definition)) (first definition) "")
        fn-form  (if (string? (first definition)) (rest definition) definition)]
    `(do
       (def ~name)
       (let [f# (fn ~@fn-form)]
         (defn ~name ~doc-string [& args#]
           (trace-fn-call '~name f# args#))))))

(defmacro dotrace
  "Given a sequence of function identifiers, evaluate the body
expressions in an environment in which the identifiers are bound to
the traced functions. Does not work on inlined functions,
such as clojure.core/+"
  [fnames & exprs]
  `(binding [~@(interleave fnames
                           (for [fname fnames]
                             `(let [f# @(var ~fname)]
                                (fn [& args#]
                                  (trace-fn-call '~fname f# args#)))))]
     ~@exprs))

(declare trace-form)
(defmulti trace-special-form (fn [form] (first form)))

(defn ^{:private true} trace-bindings
  "Trace the forms in the given binding list."
  [bindings]
  (vec (apply concat
              (map (fn [[sym value]]
                     `[~sym (trace-forms ~value)]) (partition 2 bindings)))))

 ;; Trace the let form, its bindings then the forms in its body.
(defmethod trace-special-form
  'let* [[_ bindings & body]]
  `(let* ~(trace-bindings bindings)
     (trace-forms ~@body)))

;; Trace the loop form, its bindings then the forms in its body.
(defmethod trace-special-form 
  'loop* [[_ bindings & body]]
  `(loop* ~(trace-bindings bindings)
     (trace-forms ~@body)))

;; Trace the new form, mainly its arguments.
(defmethod trace-special-form
  'new [[_ name & args]]
  `(new ~name ~@(map trace-form args)))

(defn ^{:private true} trace-fn-body
  "Trace the forms in a function body."
  [body]
  `(~(first body) ~@(map trace-form (rest body))))

;; Trace the fn form.
(defmethod trace-special-form 'fn* [[_ & args]]
  (if (symbol? (first args))
    (if (vector? (second args))
      `(fn* ~(first args) ~@(trace-fn-body (rest args)))
      `(fn* ~(first args) ~@(map trace-fn-body (rest args))))
    (if (vector? (first args))
      `(fn* ~@(trace-fn-body args))
      `(fn* ~@(map trace-fn-body args)))))

(defmethod trace-special-form :default [form] :default)

(defn ^{:private true} trace-value
  "Trace the given data structure by tracing individual values."
  [v]
  (cond
    (vector? v) `(vector ~@(map trace-form v))
    (map? v) `(into {} ~(vec (map trace-value v)))
    (set? v) `(into #{} ~(vec (map trace-form v)))
    :else v))

(defn ^{:private true} recurs?
  "Test if the given form contains a recur call."
  [form]
  (if (and (or (list? form)
               (seq? form))
           (> (count form) 0))
    (condp = (first form)
      'recur true
      'quote false
      (some identity (map recurs? (rest form))))
    false))

(defn ^{:private true} trace-form*
  "Trace the given form body except if it is to be ignored."
  [form]
  (if (and (or (list? form)
               (seq? form))
           (> (count form) 0))
    (if (ignored-form? (first form))
      form
      (let [sform (trace-special-form form)]
        (if (= sform :default)
          (let [mform (macroexpand-1 form)]
            (if (= form mform)
              (cons (first mform) (map trace-form (rest mform)))
              (trace-form mform)))
          sform)))
    (trace-value form)))

(defn trace-compose-exception 
  "Re-create a new exception with a composed message from the given exception
   and the message to be added. The exception stack trace is kept at a minimum."
  [exception message]
  (let [klass  (class exception) 
        previous-msg (.getMessage exception)
        composed-msg(str previous-msg (if-not (.endsWith previous-msg "\n") "\n") message (if-not (.endsWith message "\n") "\n"))
        ctor (.getConstructor klass (into-array [java.lang.String]))
        new-exception (cast klass (.newInstance ctor (into-array String [composed-msg])))
        new-stack-trace (into-array java.lang.StackTraceElement [(aget (.getStackTrace exception) 0)])
        _ (.setStackTrace new-exception new-stack-trace)]
     new-exception))

(defn trace-form
  "Trace the given form avoiding try catch when recur is present in the form."
  [form]
  (if (recurs? form)
    (trace-form* form)
    `(try
       ~(trace-form* form)
       (catch Exception e#
         (throw (trace-compose-exception e# (format "  Form failed: %s" (with-out-str (pprint '~form)))))))))

(defmacro trace-forms
  "Trace all the forms in the given body."
  [& body]
  `(do
     ~@(map trace-form body)))


