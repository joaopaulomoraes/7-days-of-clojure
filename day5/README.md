# Day 5 – Namespaces

The namespace provides a way to organize different Clojure objects into logical groups which logical ones are commonly called the library and can be used in other namespaces.

### ns

To define a namespace, use the `ns` macro.

```clojure
(ns seven-days-of-clojure.example)
```

`ns` can take `:require`, `:use`, and `:import` keyword.

```clojure
(ns seven-days-of-clojure.example
  (:require [clojure.java.io])
  (:use [clojure.data])
  (:import [java.util List Set]))
```

Typically, each `ns` references a specific file.

```clojure
;; file-name.clj
(ns seven-days-of-clojure.file-name)

(defn function-1
  []
  "Hello from function-1")

(defn function-2
  []
  "Hello from function-2")

(defn function-3
  []
  "Hello from function-3")
;; ...
```

### in-ns

`in-ns` allows you to switch to a specific namespace.

```clojure
(in-ns 'test)
;; user=> #object[clojure.lang.Namespace 0x415156bf "test"]

(in-ns 'calculate)
;; user=> #object[clojure.lang.Namespace 0x1ecfcbc9 "calculate"]

(in-ns 'some-other)
;; user=> #object[clojure.lang.Namespace 0x660591fb "some-ohter"]
```

### require

That you define in a namespace is not visible to other namespaces by default.

```clojure
(ns seven-days-of-clojure.calculate)

(defn sum
  [a b]
    (+ a b))

(defn div
  [c d]
    (/ c d))

(defn mult
  [e f]
    (* e f))
```

Note that if you try to access definitions in another namespace, an exception will be thrown.

```clojure
(sum 3 4)
;; user=> Unable to resolve symbol: sum in this context
```

To access other namespaces, use `require`.

```clojure
(require 'seven-days-of-clojure.calculate)
;; user=> nill

(seven-days-of-clojure.calculate/sum 3 4)
;; user=> 7
```

To create a namespace alias, use the `:as` keyword.

```clojure
(require '[seven-days-of-clojure.calculate :as calc])

(calc/mult 7 7)
;; user=> 49

(calc/div 4 2)
;; user=> 2

(calc/sum 3 5)
;; user=> 8
```

Load multiple namespaces.

```clojure
(require '[seven-days-of-clojure.example :as eg]
         '[clojure.core :as cc])
```

## Test your knowledge

- Create a namespace with some functions and try to access them from another namespace.
  - Tip: use `(in-ns' namespace-name)` to switch namespace).
- Load a namespace using an alias for a short name.
- Load multiple namespaces and use at least one resource from each in the current namespace.
- Build your imagination.

## Day 6 - Tests
[See more](/day6)

---

## License

This project is licensed under the MIT License.

[![License](http://img.shields.io/:license-mit-black.svg?style=flat-square)](http://badges.mit-license.org)
