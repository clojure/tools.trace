clojure.tools.trace
========================================

A Clojure trace tool. Defines tracing macros/fns to help you see what your code is doing.

Formerly known as clojure.contrib.trace.

See the [tools.trace API Reference](http://clojure.github.io/tools.trace/).


Releases and Dependency Information
========================================

Latest stable release: 0.7.11

* [All Released Versions](http://search.maven.org/#search|ga|1|g%3A%22org.clojure%22%20AND%20a%3A%22tools.trace%22)

* [Development Snapshot Versions](https://oss.sonatype.org/index.html#nexus-search;gav~org.clojure~tools.trace~~~)

[CLI/`deps.edn`](https://clojure.org/reference/deps_and_cli) dependency information:
```clojure
org.clojure/tools.trace {:mvn/version "0.7.11"}
```

[Leiningen](https://github.com/technomancy/leiningen) dependency information:

```clojure
    [org.clojure/tools.trace "0.7.11"]
```
    
[Maven](http://maven.apache.org/) dependency information:
```xml
    <dependency>
      <groupId>org.clojure</groupId>
      <artifactId>tools.trace</artifactId>
      <version>0.7.11</version>
    </dependency>
```



Example Usage
========================================
```clojure
=> (use 'clojure.tools.trace)

=> (trace (* 2 3)) ;; To trace a value
TRACE: 6
6

=> (trace "tag" (* 2 3)) ;; To trace a value and assign a trace tag
TRACE tag: 6
6

=> (deftrace fubar [x v] (+ x v)) ;; To trace a function call and its return value
=> (fubar 2 3)
TRACE t1107: (fubar 2 3)
TRACE t1107: => 5
5

=> (do (+ 1 3) (* 5 6) (/ 1 0))
ArithmeticException Divide by zero  clojure.lang.Numbers.divide (Numbers.java:156)
=> (trace-forms (+ 1 3) (* 5 6) (/ 1 0)) ;; To identify which form is failing
ArithmeticException Divide by zero
  Form failed: (/ 1 0)
  clojure.lang.Numbers.divide (Numbers.java:156)

(trace-ns myown.namespace) ;; To dynamically trace/untrace all fns in a name space (untrace-ns myown.namespace)

(trace-vars myown.namespace/fubar) ;; To dynamically trace/untrace specific fns (untrace-vars myown.namespace/fubar)
 
```



Developer Information
========================================

* [GitHub project](https://github.com/clojure/tools.trace)
* [Bug Tracker](https://clojure.atlassian.net/browse/TTRACE)
* [Continuous Integration](https://github.com/clojure/tools.trace/actions/workflows/test.yml)



Change Log
====================

* Release 0.7.11 Feb 11, 2021:
  * Fixed reflection warnings with type hints

* Release 0.7.10 September 23, 2018:
  * Closed TTRACE-16, applied fix from Andy Fingerhut, fixed typos in README, support Clojure 1.9, fixes to unit tests
  * Closed TTRACE-13, trace-ns macro accept both quoted or unquoted namespace argument
  
* Release 0.7.9 October 8, 2015:
  * Closed TTRACE-11, trace-vars/untrace-vars now accept vars
  * Closed TTRACE-12, move away from Java 5, extend some new throwables with ThrowableRecompose  
  * Added more tests for TTRACE-12

* Release 0.7.8 March 15, 2013:
  * Fixed README

* Release 0.7.7 March 14, 2013:
  * Replaced def by declare in deftrace macro
  * Remove unnecessary call to run-tests in test suite
  * Trace only functions in trace-vars*
  * Added missing cond in clone-throwable on a Throwable
  * Do not allow trace-vars* to reapply tracing on an already traced function

* Release 0.7.6 Aug 23, 2013:
  * Fixed crash of throwable tracing when no string based constructor exists

* Release 0.7.5 Dec 1, 2012:
  * Fixed README and comments in source file

* Release 0.7.4 Dec 1, 2012:
  * added traced? and traceable/ fns
  * removed reflection warnings
  
* Release 0.7.3 March 4, 2012:
  * added macro wrappers around fns allowing dynamic tracing.

* Release 0.7.2 Feb. 20, 2012:
  * added contribution from Michał Marczyk and Don Jackson to allow dynamic tracing of fn vars and all fns in a given namespace.
  
* Release 0.7.1 on 2011-09-18
  * moved it to new contrib modular struct
  * made it 1.2/1.3 compliant
  * supported doc strings
  * added a trace-form macro, from Jonathan Fischer
  
* Changes from clojure.trace
  * replaced *trace-out* with tracer
  * made trace a function instead of a macro (suggestion from Stuart Halloway)
  * added trace-fn-call



Copyright and License
========================================

Copyright (c) Stuart Sierra, Michel Salim, Luc Préfontaine, Jonathan Fischer Friberg, Michał Marczyk, Andy Fingerhut 2011-2018.
All rights reserved.
The use and distribution terms for this software are covered by the Eclipse Public
License 1.0 (https://opensource.org/license/epl-1-0/) which can
be found in the file epl-v10.html at the root of this distribution.
By using this software in any fashion, you are agreeing to be bound by
the terms of this license.  You must not remove this notice, or any
other, from this software.

