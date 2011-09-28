(ns test.clojure.clojure.tools.test-trace
  [:use clojure.test clojure.tools.trace [clojure.repl :only [doc]]]
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
  (is (= (.endsWith (cleanup (with-out-str (doc fn-a))) "fn-a Doc string|") true)
  (is (= (cleanup (with-out-str (fn-a 1 2 3))) "TRACE t:# (fn-a 1 2 3)|TRACE t:# => 6|"))))

(deftest test-no-docstring
  (is (= (cleanup (with-out-str (fn-b 1 2 3))) "TRACE t:# (fn-b 1 2 3)|TRACE t:# => 6|")))

(deftest test-trace-form
  (is (thrown-with-msg? ArithmeticException #"Divide by zero\n  Form failed: \(/ 9 a\)\n  Form failed: \(let\* \[a 0 b \(/ 9 a\)\] b\)\n  Form failed: \(let \[a 0 b \(/ 9 a\)\] b\)"
                        (trace-forms (let [a 0 b (/ 9 a)] b)))))

(deftest test-fn-form
  (is (thrown-with-msg? ArithmeticException #"Divide by zero\n  Form failed: \(\(fn \[\] \(let \[d \(/ 3 0\)\] d\)\)\)"
                        (fn-fn 1 2 3))))

(deftest test-maps
  (is (thrown-with-msg? ArithmeticException #"Divide by zero\n  Form failed: \(/ 3 0\)\n  Form failed: \{:a 1, :b \(/ 3 0\)\}"
                        (trace-forms {:a 1 :b (/ 3 0)}))))
(run-tests)