# Day 1 – Syntax

While knowing the history of a new language and especially its structure is important (and sometimes boring), having an overview of how things work in practice and writing some code is always more fun.

### Environment

The first important step in learning a new language is to have your initial environment set up before you [get started](https://clojure.org/guides/getting_started).

## Getting Started

After following the necessary installation steps, run to your terminal and type `clj` to get started:

```bash
Clojure 1.10.1
user=> 
```

### The classic "Hello, world!"

```clojure
(println "Hello, world!")
```

### Math operations

```clojure
(+ 4 3)
(+ 14 7)

(- 49 21)
(- 2 14)

(* 3 7)
(* 7 21)

(/ 70 7)
(/ 21 3)

(* (+ 3 4) 7)
(+ (- 2 1) 28)
(- (* 21 3) 7)
(/ (+ 4 3) 21)
```

### Flux control

```clojure
(if true
  :truthy
  :falsey)

(if (= (+ 1 1) 2)
  "Then true"
  "Opitional else value")

(let [x 7]
  (cond
    (< x 2) "x is less than 2"
    (< x 10) "x is less than 10"))

(let [x 14]
  (cond
    (< x 2)  "x is less than 2"
    (< x 10) "x is less than 10"
    :else  "x is greater than or equal to 14"))

(when true
  (println "Success!")
  "Awesome too!")

(defn foo
  [c]
    (case c
      5 "c is 5"
      10 "c is 10"))
;; user=> (foo 5)

(defn foo
  [c]
    (case c
      5 "c is 5"
      10 "c is 10"
      "c isn't 5 or 10"))
;; user=> (foo 14)
```

### Iteration for Side Effects

```clojure
(dotimes [i 7]
         (println i))

(doseq [n (range 3)]
         (println n))

(for [letter [:a :b]
             number (range 3)]
         [letter number])

(loop [i 0]
  (if (< i 10)
    (recur (inc i))
    i))
```

### Exceptions

```clojure
(try
  (/ 2 1)
  (catch ArithmeticException e
    "divide by zero")
  (finally
    (println "cleanup")))

(try
  (throw (ex-info "There was a problem" {:detail 42}))
  (catch Exception e
    (prn (:detail (ex-data e)))))
```

## Day 2 - Structures
[See more](/day2)

---

## License

This project is licensed under the MIT License.

[![License](http://img.shields.io/:license-mit-black.svg?style=flat-square)](http://badges.mit-license.org)
