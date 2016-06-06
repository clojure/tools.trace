{:namespaces
 ({:doc
   "This file defines simple tracing macros to help you see what your code is doing.",
   :author
   "Stuart Sierra, Michel Salim, Luc Préfontaine, Jonathan Fischer Friberg, Michał Marczyk, Don Jackson",
   :name "clojure.tools.trace",
   :wiki-url "http://clojure.github.io/tools.trace/index.html",
   :source-url
   "https://github.com/clojure/tools.trace/blob/d56cf7003f9cf024e1fd15ace0944e8b4793953d/src/main/clojure/clojure/tools/trace.clj"}),
 :vars
 ({:raw-source-url
   "https://github.com/clojure/tools.trace/raw/d56cf7003f9cf024e1fd15ace0944e8b4793953d/src/main/clojure/clojure/tools/trace.clj",
   :name "deftrace",
   :file "src/main/clojure/clojure/tools/trace.clj",
   :source-url
   "https://github.com/clojure/tools.trace/blob/d56cf7003f9cf024e1fd15ace0944e8b4793953d/src/main/clojure/clojure/tools/trace.clj#L102",
   :line 102,
   :var-type "macro",
   :arglists ([name & definition]),
   :doc
   "Use in place of defn; traces each call/return of this fn, including\narguments. Nested calls to deftrace'd functions will print a\ntree-like structure.\nThe first argument of the form definition can be a doc string",
   :namespace "clojure.tools.trace",
   :wiki-url
   "http://clojure.github.io/tools.trace//index.html#clojure.tools.trace/deftrace"}
  {:raw-source-url
   "https://github.com/clojure/tools.trace/raw/d56cf7003f9cf024e1fd15ace0944e8b4793953d/src/main/clojure/clojure/tools/trace.clj",
   :name "dotrace",
   :file "src/main/clojure/clojure/tools/trace.clj",
   :source-url
   "https://github.com/clojure/tools.trace/blob/d56cf7003f9cf024e1fd15ace0944e8b4793953d/src/main/clojure/clojure/tools/trace.clj#L116",
   :line 116,
   :var-type "macro",
   :arglists ([fnames & exprs]),
   :doc
   "Given a sequence of function identifiers, evaluate the body\nexpressions in an environment in which the identifiers are bound to\nthe traced functions. Does not work on inlined functions,\nsuch as clojure.core/+",
   :namespace "clojure.tools.trace",
   :wiki-url
   "http://clojure.github.io/tools.trace//index.html#clojure.tools.trace/dotrace"}
  {:raw-source-url
   "https://github.com/clojure/tools.trace/raw/d56cf7003f9cf024e1fd15ace0944e8b4793953d/src/main/clojure/clojure/tools/trace.clj",
   :name "trace",
   :file "src/main/clojure/clojure/tools/trace.clj",
   :source-url
   "https://github.com/clojure/tools.trace/blob/d56cf7003f9cf024e1fd15ace0944e8b4793953d/src/main/clojure/clojure/tools/trace.clj#L77",
   :line 77,
   :var-type "function",
   :arglists ([value] [name value]),
   :doc
   "Sends name (optional) and value to the tracer function, then\nreturns value. May be wrapped around any expression without\naffecting the result.",
   :namespace "clojure.tools.trace",
   :wiki-url
   "http://clojure.github.io/tools.trace//index.html#clojure.tools.trace/trace"}
  {:raw-source-url
   "https://github.com/clojure/tools.trace/raw/d56cf7003f9cf024e1fd15ace0944e8b4793953d/src/main/clojure/clojure/tools/trace.clj",
   :name "trace-forms",
   :file "src/main/clojure/clojure/tools/trace.clj",
   :source-url
   "https://github.com/clojure/tools.trace/blob/d56cf7003f9cf024e1fd15ace0944e8b4793953d/src/main/clojure/clojure/tools/trace.clj#L307",
   :line 307,
   :var-type "macro",
   :arglists ([& body]),
   :doc
   "Trace all the forms in the given body. Returns any underlying uncaught exceptions that may make the forms fail.",
   :namespace "clojure.tools.trace",
   :wiki-url
   "http://clojure.github.io/tools.trace//index.html#clojure.tools.trace/trace-forms"}
  {:raw-source-url
   "https://github.com/clojure/tools.trace/raw/d56cf7003f9cf024e1fd15ace0944e8b4793953d/src/main/clojure/clojure/tools/trace.clj",
   :name "trace-ns",
   :file "src/main/clojure/clojure/tools/trace.clj",
   :source-url
   "https://github.com/clojure/tools.trace/blob/d56cf7003f9cf024e1fd15ace0944e8b4793953d/src/main/clojure/clojure/tools/trace.clj#L398",
   :line 398,
   :var-type "macro",
   :arglists ([n]),
   :doc
   "Trace all fns in the given name space. The given name space can be quoted, unquoted or stored in a var.\nWe must try to resolve the expression passed to us partially to find out if it needs to be quoted or not\nwhen passed to trace-ns*",
   :namespace "clojure.tools.trace",
   :wiki-url
   "http://clojure.github.io/tools.trace//index.html#clojure.tools.trace/trace-ns"}
  {:raw-source-url
   "https://github.com/clojure/tools.trace/raw/d56cf7003f9cf024e1fd15ace0944e8b4793953d/src/main/clojure/clojure/tools/trace.clj",
   :name "trace-vars",
   :file "src/main/clojure/clojure/tools/trace.clj",
   :source-url
   "https://github.com/clojure/tools.trace/blob/d56cf7003f9cf024e1fd15ace0944e8b4793953d/src/main/clojure/clojure/tools/trace.clj#L355",
   :line 355,
   :var-type "macro",
   :arglists ([& vs]),
   :doc
   "Trace each of the specified Vars.\nThe arguments may be Var objects or symbols to be resolved in the current\nnamespace.",
   :namespace "clojure.tools.trace",
   :wiki-url
   "http://clojure.github.io/tools.trace//index.html#clojure.tools.trace/trace-vars"}
  {:raw-source-url
   "https://github.com/clojure/tools.trace/raw/d56cf7003f9cf024e1fd15ace0944e8b4793953d/src/main/clojure/clojure/tools/trace.clj",
   :name "traceable?",
   :file "src/main/clojure/clojure/tools/trace.clj",
   :source-url
   "https://github.com/clojure/tools.trace/blob/d56cf7003f9cf024e1fd15ace0944e8b4793953d/src/main/clojure/clojure/tools/trace.clj#L431",
   :line 431,
   :var-type "function",
   :arglists ([v]),
   :doc "Returns true if the given var can be traced, false otherwise",
   :namespace "clojure.tools.trace",
   :wiki-url
   "http://clojure.github.io/tools.trace//index.html#clojure.tools.trace/traceable?"}
  {:raw-source-url
   "https://github.com/clojure/tools.trace/raw/d56cf7003f9cf024e1fd15ace0944e8b4793953d/src/main/clojure/clojure/tools/trace.clj",
   :name "traced?",
   :file "src/main/clojure/clojure/tools/trace.clj",
   :source-url
   "https://github.com/clojure/tools.trace/blob/d56cf7003f9cf024e1fd15ace0944e8b4793953d/src/main/clojure/clojure/tools/trace.clj#L425",
   :line 425,
   :var-type "function",
   :arglists ([v]),
   :doc
   "Returns true if the given var is currently traced, false otherwise",
   :namespace "clojure.tools.trace",
   :wiki-url
   "http://clojure.github.io/tools.trace//index.html#clojure.tools.trace/traced?"}
  {:raw-source-url
   "https://github.com/clojure/tools.trace/raw/d56cf7003f9cf024e1fd15ace0944e8b4793953d/src/main/clojure/clojure/tools/trace.clj",
   :name "untrace-ns",
   :file "src/main/clojure/clojure/tools/trace.clj",
   :source-url
   "https://github.com/clojure/tools.trace/blob/d56cf7003f9cf024e1fd15ace0944e8b4793953d/src/main/clojure/clojure/tools/trace.clj#L416",
   :line 416,
   :var-type "macro",
   :arglists ([n]),
   :doc
   "Untrace all fns in the given name space. The given name space can be quoted, unquoted or stored in a var.\nWe must try to resolve the expression passed to us partially to find out if it needs to be quoted or not\nwhen passed to untrace-ns*",
   :namespace "clojure.tools.trace",
   :wiki-url
   "http://clojure.github.io/tools.trace//index.html#clojure.tools.trace/untrace-ns"}
  {:raw-source-url
   "https://github.com/clojure/tools.trace/raw/d56cf7003f9cf024e1fd15ace0944e8b4793953d/src/main/clojure/clojure/tools/trace.clj",
   :name "untrace-vars",
   :file "src/main/clojure/clojure/tools/trace.clj",
   :source-url
   "https://github.com/clojure/tools.trace/blob/d56cf7003f9cf024e1fd15ace0944e8b4793953d/src/main/clojure/clojure/tools/trace.clj#L365",
   :line 365,
   :var-type "macro",
   :arglists ([& vs]),
   :doc
   "Untrace each of the specified Vars.\nReverses the effect of trace-var / trace-vars / trace-ns for each\nof the arguments, replacing the traced functions with the original,\nuntraced versions.",
   :namespace "clojure.tools.trace",
   :wiki-url
   "http://clojure.github.io/tools.trace//index.html#clojure.tools.trace/untrace-vars"}
  {:raw-source-url
   "https://github.com/clojure/tools.trace/raw/d56cf7003f9cf024e1fd15ace0944e8b4793953d/src/main/clojure/clojure/tools/trace.clj",
   :name "ThrowableRecompose",
   :file "src/main/clojure/clojure/tools/trace.clj",
   :source-url
   "https://github.com/clojure/tools.trace/blob/d56cf7003f9cf024e1fd15ace0944e8b4793953d/src/main/clojure/clojure/tools/trace.clj#L211",
   :line 211,
   :var-type "protocol",
   :arglists nil,
   :doc
   "Protocol to isolate trace-form from convoluted throwables that \ndo not have a constructor with a single string argument.\n\nclone-throwable attempts to clone a throwable with a human readable stack trace\nand message :)\nIt must return a throwable of the same class. If not clonable, the original\nthrowable should be returned. At least this will preserve the original \nthrowable information.\n\nCloning should be non-obtrusive hence internal exceptions should be silently\nswallowed and return the original throwable.",
   :namespace "clojure.tools.trace",
   :wiki-url
   "http://clojure.github.io/tools.trace//index.html#clojure.tools.trace/ThrowableRecompose"}
  {:name "clone-throwable",
   :doc nil,
   :var-type "function",
   :namespace "clojure.tools.trace",
   :arglists ([this stack-trace args]),
   :wiki-url
   "http://clojure.github.io/tools.trace//index.html#clojure.tools.trace/clone-throwable",
   :source-url nil,
   :raw-source-url nil,
   :file nil})}
