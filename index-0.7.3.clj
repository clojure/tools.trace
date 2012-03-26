{:namespaces
 ({:source-url
   "https://github.com/clojure/tools.trace/blob/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace/clojure.tools.trace-api.html",
   :name "clojure.tools.trace",
   :author
   "Stuart Sierra, Michel Salim, Luc Préfontaine, Jonathan Fischer Friberg, Michał Marczyk, Don Jackson",
   :doc
   "This file defines simple tracing macros to help you see what your code is doing."}),
 :vars
 ({:name "*trace-depth*",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj#L54",
   :dynamic true,
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/*trace-depth*",
   :doc "Current stack depth of traced function calls.",
   :var-type "var",
   :line 54,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([name & definition]),
   :name "deftrace",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj#L91",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj",
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
   "https://github.com/clojure/tools.trace/blob/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj#L105",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/dotrace",
   :doc
   "Given a sequence of function identifiers, evaluate the body\nexpressions in an environment in which the identifiers are bound to\nthe traced functions. Does not work on inlined functions,\nsuch as clojure.core/+",
   :var-type "macro",
   :line 105,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:file "src/main/clojure/clojure/tools/trace.clj",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj",
   :source-url
   "https://github.com/clojure/tools.trace/blob/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj#L57",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/ignored-form?",
   :namespace "clojure.tools.trace",
   :line 57,
   :var-type "var",
   :doc "Forms to ignore when tracing forms.",
   :name "ignored-form?"}
  {:arglists ([value] [name value]),
   :name "trace",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj#L66",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/trace",
   :doc
   "Sends name (optional) and value to the tracer function, then\nreturns value. May be wrapped around any expression without\naffecting the result.",
   :var-type "function",
   :line 66,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([exception message]),
   :name "trace-compose-exception",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj#L200",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/trace-compose-exception",
   :doc
   "Re-create a new exception with a composed message from the given exception\nand the message to be added. The exception stack trace is kept at a minimum.",
   :var-type "function",
   :line 200,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([name f args]),
   :name "trace-fn-call",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj#L80",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/trace-fn-call",
   :doc
   "Traces a single call to a function f with args. 'name' is the\nsymbol name of the function.",
   :var-type "function",
   :line 80,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([form]),
   :name "trace-form",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj#L213",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/trace-form",
   :doc
   "Trace the given form avoiding try catch when recur is present in the form.",
   :var-type "function",
   :line 213,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([& body]),
   :name "trace-forms",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj#L223",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/trace-forms",
   :doc "Trace all the forms in the given body.",
   :var-type "macro",
   :line 223,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([]),
   :name "trace-indent",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj#L75",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/trace-indent",
   :doc "Returns an indentation string based on *trace-depth*",
   :var-type "function",
   :line 75,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([ns]),
   :name "trace-ns",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj#L299",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/trace-ns",
   :doc
   "Macro to wrap calls to trace-ns*, avoids quoting of the name space argument",
   :var-type "macro",
   :line 299,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([ns]),
   :name "trace-ns*",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj#L286",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/trace-ns*",
   :doc
   "Replaces each function from the given namespace with a version wrapped\nin a tracing call. Can be undone with untrace-ns. ns should be a namespace\nobject or a symbol.\n\nNo-op for clojure.core and clojure.tools.trace.",
   :var-type "function",
   :line 286,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([ns s] [v]),
   :name "trace-var*",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj#L229",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj",
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
   "https://github.com/clojure/tools.trace/blob/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj#L271",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/trace-vars",
   :doc
   "Macro to wrap calls to trace-var* on each of the specified Vars.\nThe vs may be Var objects or symbols to be resolved in the current\nnamespace.",
   :var-type "macro",
   :line 271,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([name value]),
   :name "tracer",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj#L60",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/tracer",
   :doc
   "This function is called by trace. Prints to standard output, but\nmay be rebound to do anything you like. 'name' is optional.",
   :var-type "function",
   :line 60,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([ns]),
   :name "untrace-ns",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj#L313",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/untrace-ns",
   :doc
   "Macro to wrap calls to trace-ns*, avoids quoting of the name space argument",
   :var-type "macro",
   :line 313,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([ns]),
   :name "untrace-ns*",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj#L304",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/untrace-ns*",
   :doc
   "Reverses the effect of trace-var / trace-vars / trace-ns for the\nVars in the given namespace, replacing each traced function from the\ngiven namespace with the original, untraced version.",
   :var-type "function",
   :line 304,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([ns s] [v]),
   :name "untrace-var*",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj#L253",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj",
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
   "https://github.com/clojure/tools.trace/blob/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj#L278",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/7dc9cc3e0f1a0b784559d1f2416a13c08cd66974/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/untrace-vars",
   :doc
   "Macro to wrap calls to untrace-var* on each of the specified Vars.\nReverses the effect of trace-var / trace-vars / trace-ns for each\nof the vs, replacing the traced functions with the original,\nuntraced versions.",
   :var-type "macro",
   :line 278,
   :file "src/main/clojure/clojure/tools/trace.clj"})}
