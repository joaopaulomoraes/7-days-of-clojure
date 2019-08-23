# Day 4 – Functions

In Clojure functions are first-class objects, that is, it does all the basic operations with the object, such as passing it to a function, returning from a function, and binding it to a variable.

> It is better to have 100 functions operate on one data structure than 10 functions on 10 data structures.
> — Alan Perlis

### Calling functions

All Clojure operations have the same syntax: opening parentheses, operator, operands, closing parentheses.

```clojure
(operand operator1 operator2 operatorn)
```

You may not have noticed, but so far you have seen many function calls.

```clojure
(+ 2 3)
;; user=> 7

(first [3 5 8])
;; user=> 3

((or + -) 2 3 4)
;; user> 9
```

Generally, functions can use expressions as arguments, including other functions.

```clojure
(inc 1.1)
;; user=> 2.1

(map inc [0 1 2 3])
;; user=> (1 2 3 4)
```

The last thing you need to know about function calls is that Clojure evaluates all function arguments recursively before passing them to the function.

```clojure
(+ (inc 70) (* 7 (- 13 1)))
;; user=> 155

;; (+ (inc 70) (* 7 (12)))
;; (+ (inc 70) 84)
;; (+ 71 84)
;; 155
```

### Defining Functions

In Clojure, role definitions consist of five main parts:

- `defn`
- Function name
- A docstring describing the function (optional)
- Parameters listed in brackets
- Function body

```clojure
(defn hello-name
  "Return greetings to someone"
    [name]
      (str "Hello, " name "!"))

(hello-name "John")
;; user=> "Hello, John!"

(hello-name "Rich")
;; user=> "Hello, Rich!"

(hello-name "Mark")
;; user=> "Hello, Mark!"
```

### The docstring

The `docstring` is a useful way to describe and document your code. You can view the docstring for a function in the REPL with `(doc fn-name)` — for example, `(doc map)`.

```clojure
(doc hello-name)
;; user/hello-name
;; ([name])
;;   Return greetings to someone
;; nil
```

### Parameters and Arity

Clojure functions can be defined with zero or more parameters and the number of parameters is the function’s arity. 

```clojure
;; 0-arity function
(defn no-params
  []
  "I take no parameters!")

;; 1-arity function
(defn one-param
  [p]
  (str "I take one parameter: " p))

;; 2-arity function
(defn two-params
  [p1 p2]
  (str "Two parameters! " p1 " and " p2))

;; multi-arity function
(defn multi-arity
  ;; 3-arity arguments and body
  ([first-arg second-arg third-arg]
     (do-things first-arg second-arg third-arg))
  ;; 2-arity arguments and body
  ([first-arg second-arg]
     (do-things first-arg second-arg))
  ;; 1-arity arguments and body
  ([first-arg]
     (do-things first-arg)))
```

### Destructuring

The `destructuring` lets you link names to values within a collection.

```clojure
(defn first-element
  [[first-thing]]
  first-thing)

(first-element [:el1 :el2 :el3])
;; user=> :el1
```

Clojure associate the name `lat` with the value corresponding to the key `:lat` (same for `lng`).

```clojure
(defn location
  [{lat :lat lng :lng}]
    (println (str "lat: " lat))
    (println (str "lng: " lng)))

(location {:lat 28.22 :lng 81.33})
;; user=> lat: 28.22
;; user=> lng: 81.33
```

### Function body

The function body can contain any type and will always automatically return the last evaluated value.

```clojure
(defn another-function
  []
  (+ 1 13)
  21
  "function")

(another-function)
;; user=> "function"

(defn greater-than-10
  [n]
  (if (> n 10)
    (str n " is greater than 10")
    (str n " is not greater than 10")))
(greater-than-10 5)
;; =>user "5 is not greater than 10"

(greater-than-10 11)
;; =>user "11 is greater than 10"
```

### Anonymous Functions

In Clojure, functions don’t need to have names.

```clojure
(fn [param]
  :body)
```

You could even associate your anonymous function with a name.

```clojure
(def my-special-multiplier (fn [x] (* x 3)))
(my-special-multiplier 12)
;; user=> 36
```

Clojure also offers another, more compact way to create anonymous functions by just adding the preceding `#`.

```clojure
#(* % 3)

(#(* % 3) 8)
;; user=> 24

(map #(str "Hi, " %)
     ["Annonymous" "Function"])
;; user=> ("Hi, Annonymous" "Hi, Function")
```

`%`, indicates the argument passed to the function (`%1`, `%2`, `%3`, and so on).

### Return Functions

Functions may return other functions. The functions returned are `closures`, meaning they can access all variables that were in scope when the function was created.

```clojure
(defn inc-maker
  "Create a custom incrementor"
  [inc-by]
  #(+ % inc-by))

(def inc3 (inc-maker 3))

(inc3 7)
;; user=> 10
```

`inc-by` is in scope, so the returned function has access to it even when the returned function is used outside `inc-maker`.

```clojure
(defn inner
  [from-outer]
    (fn [] (println from-outer)))

(def fn1 (inner "this is from fn1"))

(def fn2 (inner "this is yet another from fn2"))

(fn1)
;; user=> this is from fn1
;; user=> nil

(fn2)
;; user=> this is from fn2
;; user=> nil
```

## Test your knowledge

- Define a function always-thing which takes any number of arguments, ignores all of them, and returns the number 100.
- Create a function that calculates the cube of a given number.
- Define a function one-less-arg that takes two arguments:
  - f, a function
  - x, a value

- and returns another function which calls f on x plus any additional arguments.

## Day 5 - Namespaces
[See more](/day5)

---

## License

This project is licensed under the MIT License.

[![License](http://img.shields.io/:license-mit-black.svg?style=flat-square)](http://badges.mit-license.org)
