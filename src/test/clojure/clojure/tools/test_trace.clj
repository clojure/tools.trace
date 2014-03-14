(ns clojure.tools.test-trace
  "Tests for tools.trace."
  [:use [clojure.test] [clojure.tools.trace]]
  [:require [clojure.string :as s]])

(defn ^{:private true}
       cleanup
  "Remove variable output from the trace output and replace end of lines by |"
  [s]
  (s/replace (s/replace s #"t[0-9]+:" "t:#") #"\n" "|"))

(deftrace fn-a
  "fn-a Doc string"
  [a b c]
  (+ a b c))

(deftrace fn-b
  [a b c]
  (+ a b c))

(defn fn-let
  [a b c]
  (trace-forms (let [ d (/ 3 0)] d)))

(defn fn-fn
  [a b c]
  (trace-forms ((fn [] (let [ d (/ 3 0)] d)))))

(deftest test-with-docstring
  (is (= (.endsWith ^String (cleanup (:doc (meta (var fn-a)))) "fn-a Doc string") true)
  (is (= (cleanup (with-out-str (fn-a 1 2 3))) "TRACE t:# (fn-a 1 2 3)|TRACE t:# => 6|"))))

(deftest test-no-docstring
  (is (= (cleanup (with-out-str (fn-b 1 2 3))) "TRACE t:# (fn-b 1 2 3)|TRACE t:# => 6|")))

(deftest test-trace-form
  (is (thrown-with-msg? ArithmeticException #"Divide by zero\n  Form failed: \(/ 9 a\)\n  Form failed: \(let\* \[a 0 b \(/ 9 a\)\] b\)\n  Form failed: \(let \[a 0 b \(/ 9 a\)\] b\)"
                        (trace-forms (let [a 0 b (/ 9 a)] b)))))

(deftest test-throwables
  (is (thrown-with-msg? AssertionError #"Assert failed: \(\= 2 3\)\n  Form failed: \(assert \(\= 2 3\)\)"
                        (trace-forms (assert (= 2 3)))))
  (is (thrown? java.lang.ThreadDeath
                        (trace-forms (throw (java.lang.ThreadDeath.)))))
  (is (thrown-with-msg? java.nio.charset.CoderMalfunctionError #"Any string would do"
                        (trace-forms (throw (java.nio.charset.CoderMalfunctionError. (Exception. "Any string would do"))))))
;; Re-enable this test when Java 5 support is dropped
;  (is (thrown?  java.io.IOError
;                         (trace-forms (throw (java.io.IOError. (Throwable. "Any string would do"))))))
  (is (thrown-with-msg? Throwable #"Any string would do"
                        (trace-forms (throw (Throwable. "Any string would do")))))
  (is (thrown-with-msg? Exception #"Any string would do"
                        (trace-forms (throw (Exception. "Any string would do")))))) 

(deftest test-fn-form
  (is (thrown-with-msg? ArithmeticException #"Divide by zero\n  Form failed: \(\(fn \[\] \(let \[d \(/ 3 0\)\] d\)\)\)"
                        (fn-fn 1 2 3))))

(deftest test-maps
  (is (thrown-with-msg? ArithmeticException #"Divide by zero\n  Form failed: \(/ 3 0\)\n  Form failed: \{:a 1, :b \(/ 3 0\)\}"
                        (trace-forms {:a 1 :b (/ 3 0)}))))

(def trace-ns-test-namespace (create-ns 'trace.test.namesp))

(binding [*ns* trace-ns-test-namespace]
  (eval '(clojure.core/refer-clojure))
  (eval '(defn foo [] :foo))
  (eval '(defn bar [] (foo)))
  (eval '(def baz :baz)))

(deftest test-trace-foo
  (trace-vars trace.test.namesp/bar)
  (is (= (cleanup (with-out-str (trace.test.namesp/bar)))
         "TRACE t:# (trace.test.namesp/bar)|TRACE t:# => :foo|"))
  (untrace-vars trace.test.namesp/bar)
  (is (= (cleanup (with-out-str (trace.test.namesp/bar))) "")))

(deftest test-trace-all
  (trace-vars trace.test.namesp/bar trace.test.namesp/foo)
  (is (= (cleanup (with-out-str (trace.test.namesp/bar)))
         "TRACE t:# (trace.test.namesp/bar)|TRACE t:# | (trace.test.namesp/foo)|TRACE t:# | => :foo|TRACE t:# => :foo|" ))
  (untrace-vars trace.test.namesp/bar trace.test.namesp/foo)
  (is (= (cleanup (with-out-str (trace.test.namesp/bar))) "")))

(deftest test-trace-ns
  (trace-ns trace-ns-test-namespace)
  (is (= (cleanup (with-out-str (trace.test.namesp/bar)))
         "TRACE t:# (trace.test.namesp/bar)|TRACE t:# | (trace.test.namesp/foo)|TRACE t:# | => :foo|TRACE t:# => :foo|"))
  (untrace-ns trace-ns-test-namespace)
  (is (= (cleanup (with-out-str (trace.test.namesp/bar))) "")))

(deftest istraced
  (is (not (traced? 'trace.test.namesp/bar)))
  (trace-vars trace.test.namesp/bar)
  (is (traced? 'trace.test.namesp/bar))
  (trace-vars trace.test.namesp/bar)
  (trace-vars trace.test.namesp/bar)
  (trace-vars trace.test.namesp/bar)
  (untrace-vars trace.test.namesp/bar)
  (is (not (traced? 'trace.test.namesp/bar))))

(deftest test-trace-ns-does-not-trace-non-fns
  (is (not (traced? 'trace.test.namesp/bar)))
  (is (not (traced? 'trace.test.namesp/baz)))
  (trace-ns trace-ns-test-namespace)
  (is (traced? 'trace.test.namesp/bar))
  (is (not (traced? 'trace.test.namesp/baz)))
  (untrace-ns trace-ns-test-namespace)
  (is (not (traced? 'trace.test.namesp/bar)))
  (is (not (traced? 'trace.test.namesp/baz))))

(deftest istraceable
  (is (traceable? 'trace.test.namesp/bar)))
