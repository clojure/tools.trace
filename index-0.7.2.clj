{:namespaces
 ({:source-url
   "https://github.com/clojure/tools.trace/blob/4effdbee0836f730db15c1f893699942a9b47417/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace/clojure.tools.trace-api.html",
   :name "clojure.tools.trace",
   :author
   "Stuart Sierra, Michel Salim, Luc Préfontaine, Jonathan Fischer Friberg",
   :doc
   "This file defines simple tracing macros to help you see what your code is doing."}),
 :vars
 ({:name "*trace-depth*",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/4effdbee0836f730db15c1f893699942a9b47417/src/main/clojure/clojure/tools/trace.clj#L46",
   :dynamic true,
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/4effdbee0836f730db15c1f893699942a9b47417/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/*trace-depth*",
   :doc "Current stack depth of traced function calls.",
   :var-type "var",
   :line 46,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([name & definition]),
   :name "deftrace",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/4effdbee0836f730db15c1f893699942a9b47417/src/main/clojure/clojure/tools/trace.clj#L83",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/4effdbee0836f730db15c1f893699942a9b47417/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/deftrace",
   :doc
   "Use in place of defn; traces each call/return of this fn, including\narguments. Nested calls to deftrace'd functions will print a\ntree-like structure.\nThe first argument of the form definition can be a doc string",
   :var-type "macro",
   :line 83,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([fnames & exprs]),
   :name "dotrace",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/4effdbee0836f730db15c1f893699942a9b47417/src/main/clojure/clojure/tools/trace.clj#L97",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/4effdbee0836f730db15c1f893699942a9b47417/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/dotrace",
   :doc
   "Given a sequence of function identifiers, evaluate the body\nexpressions in an environment in which the identifiers are bound to\nthe traced functions. Does not work on inlined functions,\nsuch as clojure.core/+",
   :var-type "macro",
   :line 97,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:file "src/main/clojure/clojure/tools/trace.clj",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/4effdbee0836f730db15c1f893699942a9b47417/src/main/clojure/clojure/tools/trace.clj",
   :source-url
   "https://github.com/clojure/tools.trace/blob/4effdbee0836f730db15c1f893699942a9b47417/src/main/clojure/clojure/tools/trace.clj#L49",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/ignored-form?",
   :namespace "clojure.tools.trace",
   :line 49,
   :var-type "var",
   :doc "Forms to ignore when tracing forms.",
   :name "ignored-form?"}
  {:arglists ([value] [name value]),
   :name "trace",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/4effdbee0836f730db15c1f893699942a9b47417/src/main/clojure/clojure/tools/trace.clj#L58",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/4effdbee0836f730db15c1f893699942a9b47417/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/trace",
   :doc
   "Sends name (optional) and value to the tracer function, then\nreturns value. May be wrapped around any expression without\naffecting the result.",
   :var-type "function",
   :line 58,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([exception message]),
   :name "trace-compose-exception",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/4effdbee0836f730db15c1f893699942a9b47417/src/main/clojure/clojure/tools/trace.clj#L192",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/4effdbee0836f730db15c1f893699942a9b47417/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/trace-compose-exception",
   :doc
   "Re-create a new exception with a composed message from the given exception\nand the message to be added. The exception stack trace is kept at a minimum.",
   :var-type "function",
   :line 192,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([name f args]),
   :name "trace-fn-call",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/4effdbee0836f730db15c1f893699942a9b47417/src/main/clojure/clojure/tools/trace.clj#L72",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/4effdbee0836f730db15c1f893699942a9b47417/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/trace-fn-call",
   :doc
   "Traces a single call to a function f with args. 'name' is the\nsymbol name of the function.",
   :var-type "function",
   :line 72,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([form]),
   :name "trace-form",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/4effdbee0836f730db15c1f893699942a9b47417/src/main/clojure/clojure/tools/trace.clj#L205",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/4effdbee0836f730db15c1f893699942a9b47417/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/trace-form",
   :doc
   "Trace the given form avoiding try catch when recur is present in the form.",
   :var-type "function",
   :line 205,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([& body]),
   :name "trace-forms",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/4effdbee0836f730db15c1f893699942a9b47417/src/main/clojure/clojure/tools/trace.clj#L215",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/4effdbee0836f730db15c1f893699942a9b47417/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/trace-forms",
   :doc "Trace all the forms in the given body.",
   :var-type "macro",
   :line 215,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([]),
   :name "trace-indent",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/4effdbee0836f730db15c1f893699942a9b47417/src/main/clojure/clojure/tools/trace.clj#L67",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/4effdbee0836f730db15c1f893699942a9b47417/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/trace-indent",
   :doc "Returns an indentation string based on *trace-depth*",
   :var-type "function",
   :line 67,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([name value]),
   :name "tracer",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/4effdbee0836f730db15c1f893699942a9b47417/src/main/clojure/clojure/tools/trace.clj#L52",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/4effdbee0836f730db15c1f893699942a9b47417/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/tracer",
   :doc
   "This function is called by trace. Prints to standard output, but\nmay be rebound to do anything you like. 'name' is optional.",
   :var-type "function",
   :line 52,
   :file "src/main/clojure/clojure/tools/trace.clj"})}
