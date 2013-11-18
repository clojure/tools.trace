clojure.tools.trace
========================================

A Clojure trace tool. Defines tracing macros/fns to help you see what your code is doing.

Formerly known as clojure.contrib.trace.



Releases and Dependency Information
========================================

Latest stable release: 0.7.6

* [All Released Versions](http://search.maven.org/#search|ga|1|g%3A%22org.clojure%22%20AND%20a%3A%22tools.trace%22)

* [Development Snapshot Versions](https://oss.sonatype.org/index.html#nexus-search;gav~org.clojure~tools.trace~~~)

[Leiningen](https://github.com/technomancy/leiningen) dependency information:

```clojure
    [org.clojure/tools.trace "0.7.6"]
```
    
[Maven](http://maven.apache.org/) dependency information:
```xml
    <dependency>
      <groupId>org.clojure</groupId>
      <artifactId>tools.trace</artifactId>
      <version>0.7.6</version>
    </dependency>
```



Example Usage
========================================
```clojure
(use 'clojure.tools.trace)

(trace (* 2 3)) ;; To trace a value

(trace tag (* 2 3)) ;; To trace a value and assign a trace tag

(deftrace fubar [x v] (+ x v)) ;; To trace a function call and its return value

(trace-forms (+ 1 3) (* 5 6) (/ 1 0))

(trace-ns 'myown.namespace) ;; To dynamically trace/untrace all fns in a name space (untrace-ns 'myown.namespace)

(trace-vars myown.namespace/fubar) ;; To dynamically trace/untrace specific fns (untrace-vars myown.namespace/fubar)
 
```



Developer Information
========================================

* [GitHub project](https://github.com/clojure/tools.trace)

* [Bug Tracker](http://dev.clojure.org/jira/browse/TTRACE)

* [Continuous Integration](http://build.clojure.org/job/tools.trace/)

* http://build.clojure.org/job/tools.trace-test-matrix/



Change Log
====================

* Release 0.7.6 Aug 23, 2013: Luc Préfontaine
  * Fixed crash of throwable tracing when no string based constructor exists

* Release 0.7.5 Dec 1, 2012: Luc Préfontaine
  * Fixed README and comments in source file

* Release 0.7.4 Dec 1, 2012: Luc Préfontaine
  * added traced? and traceable/ fns
  * removed reflection warnings
  
* Release 0.7.3 March 4, 2012: Luc Préfontaine
  * added macro wrappers around fns allowing dynamic tracing.

* Release 0.7.2 Feb. 20, 2012: Luc Préfontaine
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

Copyright (c) Stuart Sierra, Michel Salim, Luc Préfontaine, Jonathan Fischer Friberg, Michał Marczyk, 2011-2012.
All rights reserved.
The use and distribution terms for this software are covered by the Eclipse Public
License 1.0 (http://opensource.org/licenses/eclipse-1.0.php) which can
be found in the file epl-v10.html at the root of this distribution.
By using this software in any fashion, you are agreeing to be bound by
the terms of this license.  You must not remove this notice, or any
other, from this software.
