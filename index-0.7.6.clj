{:namespaces
 ({:source-url
   "https://github.com/clojure/tools.trace/blob/c91034a2339250a209fa94d9f6b2337410e1285b/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace/clojure.tools.trace-api.html",
   :name "clojure.tools.trace",
   :author
   "Stuart Sierra, Michel Salim, Luc Préfontaine, Jonathan Fischer Friberg, Michał Marczyk, Don Jackson",
   :doc
   "This file defines simple tracing macros to help you see what your code is doing."}),
 :vars
 ({:arglists ([name & definition]),
   :name "deftrace",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/c91034a2339250a209fa94d9f6b2337410e1285b/src/main/clojure/clojure/tools/trace.clj#L97",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/c91034a2339250a209fa94d9f6b2337410e1285b/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/deftrace",
   :doc
   "Use in place of defn; traces each call/return of this fn, including\narguments. Nested calls to deftrace'd functions will print a\ntree-like structure.\nThe first argument of the form definition can be a doc string",
   :var-type "macro",
   :line 97,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([fnames & exprs]),
   :name "dotrace",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/c91034a2339250a209fa94d9f6b2337410e1285b/src/main/clojure/clojure/tools/trace.clj#L111",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/c91034a2339250a209fa94d9f6b2337410e1285b/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/dotrace",
   :doc
   "Given a sequence of function identifiers, evaluate the body\nexpressions in an environment in which the identifiers are bound to\nthe traced functions. Does not work on inlined functions,\nsuch as clojure.core/+",
   :var-type "macro",
   :line 111,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([value] [name value]),
   :name "trace",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/c91034a2339250a209fa94d9f6b2337410e1285b/src/main/clojure/clojure/tools/trace.clj#L72",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/c91034a2339250a209fa94d9f6b2337410e1285b/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/trace",
   :doc
   "Sends name (optional) and value to the tracer function, then\nreturns value. May be wrapped around any expression without\naffecting the result.",
   :var-type "function",
   :line 72,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([& body]),
   :name "trace-forms",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/c91034a2339250a209fa94d9f6b2337410e1285b/src/main/clojure/clojure/tools/trace.clj#L303",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/c91034a2339250a209fa94d9f6b2337410e1285b/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/trace-forms",
   :doc
   "Trace all the forms in the given body. Returns any underlying uncaught exceptions that may make the forms fail.",
   :var-type "macro",
   :line 303,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([ns]),
   :name "trace-ns",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/c91034a2339250a209fa94d9f6b2337410e1285b/src/main/clojure/clojure/tools/trace.clj#L379",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/c91034a2339250a209fa94d9f6b2337410e1285b/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/trace-ns",
   :doc "Trace all fns in the given name space.",
   :var-type "macro",
   :line 379,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([& vs]),
   :name "trace-vars",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/c91034a2339250a209fa94d9f6b2337410e1285b/src/main/clojure/clojure/tools/trace.clj#L351",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/c91034a2339250a209fa94d9f6b2337410e1285b/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/trace-vars",
   :doc
   "Trace each of the specified Vars.\nThe arguments may be Var objects or symbols to be resolved in the current\nnamespace.",
   :var-type "macro",
   :line 351,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([v]),
   :name "traceable?",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/c91034a2339250a209fa94d9f6b2337410e1285b/src/main/clojure/clojure/tools/trace.clj#L404",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/c91034a2339250a209fa94d9f6b2337410e1285b/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/traceable?",
   :doc "Returns true if the given var can be traced, false otherwise",
   :var-type "function",
   :line 404,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([v]),
   :name "traced?",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/c91034a2339250a209fa94d9f6b2337410e1285b/src/main/clojure/clojure/tools/trace.clj#L398",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/c91034a2339250a209fa94d9f6b2337410e1285b/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/traced?",
   :doc
   "Returns true if the given var is currently traced, false otherwise",
   :var-type "function",
   :line 398,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([ns]),
   :name "untrace-ns",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/c91034a2339250a209fa94d9f6b2337410e1285b/src/main/clojure/clojure/tools/trace.clj#L393",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/c91034a2339250a209fa94d9f6b2337410e1285b/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/untrace-ns",
   :doc "Untrace all fns in the given name space.",
   :var-type "macro",
   :line 393,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([& vs]),
   :name "untrace-vars",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/c91034a2339250a209fa94d9f6b2337410e1285b/src/main/clojure/clojure/tools/trace.clj#L358",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/c91034a2339250a209fa94d9f6b2337410e1285b/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/untrace-vars",
   :doc
   "Untrace each of the specified Vars.\nReverses the effect of trace-var / trace-vars / trace-ns for each\nof the arguments, replacing the traced functions with the original,\nuntraced versions.",
   :var-type "macro",
   :line 358,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:file "src/main/clojure/clojure/tools/trace.clj",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/c91034a2339250a209fa94d9f6b2337410e1285b/src/main/clojure/clojure/tools/trace.clj",
   :source-url
   "https://github.com/clojure/tools.trace/blob/c91034a2339250a209fa94d9f6b2337410e1285b/src/main/clojure/clojure/tools/trace.clj#L206",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/ThrowableRecompose",
   :namespace "clojure.tools.trace",
   :line 206,
   :var-type "protocol",
   :doc
   "Protocol to isolate trace-form from convoluted throwables that \ndo not have a constructor with a single string argument.\n\nclone-throwable attempts to clone a throwable with a human readable stack trace\nand message :)\nIt must return a throwable of the same class. If not clonable, the original\nthrowable should be returned. At least this will preserve the original \nthrowable information.\n\nCloning should be non-obtrusive hence internal exceptions should be silently\nswallowed and return the original throwable.",
   :name "ThrowableRecompose"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/clone-throwable",
   :namespace "clojure.tools.trace",
   :var-type "function",
   :arglists ([this stack-trace args]),
   :doc nil,
   :name "clone-throwable"})}
