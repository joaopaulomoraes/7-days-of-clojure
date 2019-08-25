# Day 5 – Namespaces

The Clojure main library includes a test framework written by Stuart Sierra and the test framework is under the `clojure.test` namespace.

```clojure
(ns seven-days-of-clojure.tests
  (:use clojure.test))
```

Let's look at some examples.

### is

```clojure
(ns seven-days-of-clojure.tests
  (:use clojure.test))

(is (= 5 (+ 2 2)))
;; FAIL in () (NO_SOURCE_FILE:1)
;; expected: (= 5 (+ 2 2))
;;   actual: (not (= 5 4))
;; false

(is (= 7 (+ 3 4)))
;; true
```

`is` takes an optional second argument, a string describing the assertion.

```clojure
(is (= false (> 49 7)) "False arithmetic test.")
;; FAIL in () (NO_SOURCE_FILE:1)
;; False arithmetic test.
;; expected: (= false (> 49 7))
;;   actual: (not (= false true))
;; false
```

### testing

In addition, you can document groups of assertions with the
`testing` macro.

```clojure
(testing "Arithmetic"
  (testing "with positive integers"
    (is (= 4 (+ 2 2)))
    (is (= 7 (+ 3 4))))
  (testing "with negative integers"
    (is (= -4 (+ -2 -2)))
    (is (= -1 (+ 3 -4)))))
;; true
```

### deftest

To set tests apart from the rest of your code, even in a different namespace, use the `deftest` function.

```clojure
(deftest is-one-less-than-two
  (is (= 1 1)))

(deftest is-42-equals-42
  (is (= 42 42)))

(deftest is-number-different-from-string
  (is (= (not (= "13" 18)))))
```

Note the namespace below with its functions.

```clojure
(ns seven-days-of-clojure.some-functions)

;; number
(defn one
  []
    1)

;; floating-point
(defn floating-point
  []
    7.7)

;; String
(defn language
  []
    (str "Clojure"))

;; boolean
(defn is-bool
  []
    true)

;; map
(defn author
  []
    {:id "id-01"
     :name "author"
     :email "author@clj.map"})

;; keyword
(defn paradigm
  []
    :fp)
```

Test by importing into a specific test namespace.

```clojure
(ns seven-days-of-clojure.tests
  (:require [clojure.test :refer :all]
            [seven-days-of-clojure.some-functions :refer :all]))

(deftest one-test
  (testing "Should return 1."
    (is (= 1 (seven-days-of-clojure.some-functions/one)))))

(deftest floating-point-test
  (testing "Should return 7.7."
    (is (= 7.7 (seven-days-of-clojure.some-functions/floating-point)))))

(deftest language-test
  (testing "Should return Clojure."
    (is (= "Clojure" (seven-days-of-clojure.some-functions/language)))))

(deftest is-bool-test
  (testing "Should return true."
    (is (= true (seven-days-of-clojure.some-functions/is-bool)))))

(deftest author-test
  (testing "Shoud return an author {:id, :name, :email}."
    (is (= {:id "id-01"
            :name "author"
            :email "author@clj.map"} (seven-days-of-clojure.some-functions/author)))))

(deftest paradigm-test
  (testing "Should return :fp."
    (is (= :fp (seven-days-of-clojure.some-functions/paradigm)))))
```

### run-tests

Run the tests with the `run-tests` function followed by their namespaces.

```clojure
(run-tests 'seven-days-of-clojure.tests)
;; Testing seven-days-of-clojure.tests

;; Ran 9 tests containing 9 assertions.
;; 0 failures, 0 errors.
;; {:test 9, :pass 9, :fail 0, :error 0, :type :summary}
```

## Test your knowledge

- Create a test that checks if an argument is greater than `10`.
- Create a test that tests if the return of a function is a string with the value `" I love learn Clojure "`.
- Create a namespace with many different functions and test them all by importing into a specific namespace for testing.
- Build your imagination

## Day 6 - ?
[See more](/day7)

---

## License

This project is licensed under the MIT License.

[![License](http://img.shields.io/:license-mit-black.svg?style=flat-square)](http://badges.mit-license.org)
