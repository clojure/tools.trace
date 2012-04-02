{:namespaces
 ({:source-url
   "https://github.com/clojure/tools.trace/blob/14849ddb99de5e8c474a9758c9f52b8bdeebd576/src/main/clojure/clojure/tools/trace.clj",
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
   "https://github.com/clojure/tools.trace/blob/14849ddb99de5e8c474a9758c9f52b8bdeebd576/src/main/clojure/clojure/tools/trace.clj#L91",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/14849ddb99de5e8c474a9758c9f52b8bdeebd576/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/deftrace",
   :doc
   "Use in place of defn; traces each call/return of this fn, including\narguments. Nested calls to deftrace'd functions will print a\ntree-like structure.\nThe first argument of the form definition can be a doc string",
   :var-type "macro",
   :line 91,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([fnames & exprs]),
   :name "dotrace",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/14849ddb99de5e8c474a9758c9f52b8bdeebd576/src/main/clojure/clojure/tools/trace.clj#L105",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/14849ddb99de5e8c474a9758c9f52b8bdeebd576/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/dotrace",
   :doc
   "Given a sequence of function identifiers, evaluate the body\nexpressions in an environment in which the identifiers are bound to\nthe traced functions. Does not work on inlined functions,\nsuch as clojure.core/+",
   :var-type "macro",
   :line 105,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([value] [name value]),
   :name "trace",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/14849ddb99de5e8c474a9758c9f52b8bdeebd576/src/main/clojure/clojure/tools/trace.clj#L66",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/14849ddb99de5e8c474a9758c9f52b8bdeebd576/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/trace",
   :doc
   "Sends name (optional) and value to the tracer function, then\nreturns value. May be wrapped around any expression without\naffecting the result.",
   :var-type "function",
   :line 66,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([& body]),
   :name "trace-forms",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/14849ddb99de5e8c474a9758c9f52b8bdeebd576/src/main/clojure/clojure/tools/trace.clj#L223",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/14849ddb99de5e8c474a9758c9f52b8bdeebd576/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/trace-forms",
   :doc "Trace all the forms in the given body.",
   :var-type "macro",
   :line 223,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([ns]),
   :name "trace-ns",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/14849ddb99de5e8c474a9758c9f52b8bdeebd576/src/main/clojure/clojure/tools/trace.clj#L299",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/14849ddb99de5e8c474a9758c9f52b8bdeebd576/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/trace-ns",
   :doc "Trace all fns in the given name space.",
   :var-type "macro",
   :line 299,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([ns s] [v]),
   :name "trace-var*",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/14849ddb99de5e8c474a9758c9f52b8bdeebd576/src/main/clojure/clojure/tools/trace.clj#L229",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/14849ddb99de5e8c474a9758c9f52b8bdeebd576/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/trace-var*",
   :doc
   "If the specified Var holds an IFn and is not marked as a macro, its\ncontents is replaced with a version wrapped in a tracing call;\notherwise nothing happens. Can be undone with untrace-var.\n\nIn the unary case, v should be a Var object or a symbol to be\nresolved in the current namespace.\n\nIn the binary case, ns should be a namespace object or a symbol\nnaming a namespace and s a symbol to be resolved in that namespace.",
   :var-type "function",
   :line 229,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([& vs]),
   :name "trace-vars",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/14849ddb99de5e8c474a9758c9f52b8bdeebd576/src/main/clojure/clojure/tools/trace.clj#L271",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/14849ddb99de5e8c474a9758c9f52b8bdeebd576/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/trace-vars",
   :doc
   "Trace each of the specified Vars.\nThe arguments may be Var objects or symbols to be resolved in the current\nnamespace.",
   :var-type "macro",
   :line 271,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([ns]),
   :name "untrace-ns",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/14849ddb99de5e8c474a9758c9f52b8bdeebd576/src/main/clojure/clojure/tools/trace.clj#L313",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/14849ddb99de5e8c474a9758c9f52b8bdeebd576/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/untrace-ns",
   :doc "Untrace all fns in the given name space.",
   :var-type "macro",
   :line 313,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([ns s] [v]),
   :name "untrace-var*",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/14849ddb99de5e8c474a9758c9f52b8bdeebd576/src/main/clojure/clojure/tools/trace.clj#L253",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/14849ddb99de5e8c474a9758c9f52b8bdeebd576/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/untrace-var*",
   :doc
   "Reverses the effect of trace-var / trace-vars / trace-ns for the\ngiven Var, replacing the traced function with the original, untraced\nversion. No-op for non-traced Vars.\n\nArgument types are the same as those for trace-var.",
   :var-type "function",
   :line 253,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([& vs]),
   :name "untrace-vars",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/14849ddb99de5e8c474a9758c9f52b8bdeebd576/src/main/clojure/clojure/tools/trace.clj#L278",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/14849ddb99de5e8c474a9758c9f52b8bdeebd576/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/untrace-vars",
   :doc
   "Untrace each of the specified Vars.\nReverses the effect of trace-var / trace-vars / trace-ns for each\nof the arguments, replacing the traced functions with the original,\nuntraced versions.",
   :var-type "macro",
   :line 278,
   :file "src/main/clojure/clojure/tools/trace.clj"})}
