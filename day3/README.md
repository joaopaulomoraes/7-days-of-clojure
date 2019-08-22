# Day 3 – Control flow and Recursion

The following function section provides examples of simple control flow and recursion.

## Control flow

### if

In Clojure, you can only pass one expression to a branch of `if`.
However, if you often need to pass more than one expression in real programs, combine with `do` function.

```clojure
(if true
  :truthy
  :falsey)
;; user=> :truthy

(if (> 3 2)
  "Higher"
  "Lower")
;; user=> "Higher"

(if false
  (println "two"))
;; user=> nill

(if (odd? 41)
    (inc 42)
    42)
;; user=> 43

(if true
  (do (println "Nice!")
      "Another nice expression!")
  (do (println "Boring!")
      "A boring expression!"))
;; user=> Nice!
;; user=> "Another nice expression!"
```

### when

The when operator is like a combination of if and do, but with no else branch.

```clojure
(when true
  (println "Nice!")
  "Another nice expression!")
;; user=> Nice!
;; user=> "Another nice expression!"

(when (> 3 2)
      "Higher")
;; user=> "Higher"
```

### case

`case` compares the value with each condition with `=` and evaluates the expression in the matched branch.

```clojure
(case 5
      5 "c is 5"
      10 "c is 10")
;; user=> "c is 5"

(case (inc 7)
  1 "macOS"
  2 "Linux"
  3 "Windows"
  "Confused Travolta GIF")
;; user=> "Confused Travolta GIF"
```

### cond

Similar to `case`,  `cond` return the associated value of the first condition that is true.

```clojure
(cond
  (= 7 (inc 2)) false
  (= 16 (* 8 2)) true)
;; user=> true

;; You use :whatever-you-want keyword for the default case.
(cond
    (= 7 1) "1"
    (and (> 7 3) (< 7 10)) "7 is over 3 and under 10"
    :whatever-you-want "7 is other")
;; user=> "7 is over 3 and under 10"
```

### or

`or` returns either the first truthy value or the last value.

```clojure
(or false nil :first-word-value :second-word-value)
;; => :first-word-value

(or (= 0 1) (= "yes" "no"))
;; => false

(or (= 1 1))
;; user=> true
```

### and

`and` returns the first falsey value or, if no values are falsey, the last truthy value.

```clojure
(and "days" "months")
;; user=> "months"

(and nil true)
;; user=> nil

(and :a :b (and :c :d))
;; user=> :d
```

## Recursion

A function is recursive when it calls itself within its definition.

```clojure
(defn fibo-recursive
  [n]
    (if (or (= n 0) (= n 1))
      n
        (+ (fibo-recursive (- n 1)) (fibo-recursive (- n 2)))))

(fibo-recursive 6)
;; user=> 13
```

### recur

`recur` is a handy tool to do recursion in Clojure.

```clojure
(defn fib-with-recur [n]
  (if (> n 1)
    (loop [x (- n 2)
            v [0 1]]
      (if (> x 0)
        (recur (dec x) (conj v (+ (peek v) (peek (pop v)))))
        v))
    [0]))

(fib-with-recur 7)
;; user=> [0 1 1 2 3 5 8]
```

### loop

```clojure
(loop [i 0]
  (if (< i 10)
    (recur (inc i))
    i))
;; user=> 10
```

### dotimes

```clojure
(dotimes [i 7]
         (println i))
;; user=>
;; 0
;; 1
;; 2
;; 3
;; 4
;; 5
;; 6
;; nil

(dotimes [y 5] 
  (println (map #(inc %) (range (inc y)))))
;; user=>
;; (1)
;; (1 2)
;; (1 2 3)
;; (1 2 3 4)
;; (1 2 3 4 5)
;; nil
```

### for

```clojure
(for [letter [:a :b]
             number (range 3)]
         [letter number])
;; user=> ([:a 0] [:a 1] [:a 2] [:b 0] [:b 1] [:b 2])

(for [x (range) :while (< x 10) 
             y (range) :while (<= y x)]
         [x y])
;; user=>
;; ([0 0]
;;  [1 0] [1 1]
;;  [2 0] [2 1] [2 2]
;;  [3 0] [3 1] [3 2] [3 3]
;;  [4 0] [4 1] [4 2] [4 3] [4 4]
;;  [5 0] [5 1] [5 2] [5 3] [5 4] [5 5]
;;  [6 0] [6 1] [6 2] [6 3] [6 4] [6 5] [6 6]
;;  [7 0] [7 1] [7 2] [7 3] [7 4] [7 5] [7 6] [7 7]
;;  [8 0] [8 1] [8 2] [8 3] [8 4] [8 5] [8 6] [8 7] [8 8]
;;  [9 0] [9 1] [9 2] [9 3] [9 4] [9 5] [9 6] [9 7] [9 8] [9 9])
```

## Test your knowledge

- Use some flow of control to determine an athlete's category.
- Calculate the factorial of a number.
- Multiply all even numbers in the range of a number until it equals itself.
- Build your imagination.

## Day 4 - Functions
[See more](/day4)

---

## License

This project is licensed under the MIT License.

[![License](http://img.shields.io/:license-mit-black.svg?style=flat-square)](http://badges.mit-license.org)
