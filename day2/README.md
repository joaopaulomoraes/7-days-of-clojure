# Day 2 – Structures

All Clojure code is written in a uniform Lisp-based and recognizes two types of structures:

## 1. Literal representations

Below are some examples of literal representations of common primitives in Clojure.

### Numeric types

```clojure
42      ; integer
1.4     ; floating point
49/7    ; ratio
-21     ; integer
```

### Character types

```clojure
"hello"     ; string
\e          ; character
#"[0-9]+"   ; regular expression
```

### Symbols and idents

```clojure
map             ; symbol
*               ; symbol - most punctuation allowed
clojure.core/+  ; namespaced symbol
nil             ; null value
true false      ; booleans
:alpha          ; keyword
:release/alpha  ; keyword with namespace
```

### Literal collections

```clojure
'(:a 1 3)                   ; list
[0 1 2]                     ; vector
#{1 2 3}                    ; set
{:a "hello", :b "world"}    ; map
```

You car see more in [official documentation](https://clojure.org/guides/learn/syntax).

## 2. Operations

```clojure
(operator operand1 operand2 ...operandn)
```

Notice that there are no commas. Clojure uses whitespace to separate operands, and it treats commas as whitespace.

```clojure
(+ 1 2 3 4 5 6 7)
;; user=> 28
```

```clojure
(str "Clojure is awesome! " "And this is a way " "to concatenate strings.")
;; user=> "Clojure is awesome! And this is a way to concatenate strings."
```

In the first operation, the operator `+` adds the operands 1, 2, 3, 4, 5, 6 and 7. In the second operation, the operator `str` concatenates three strings to form a new string.

## Numbers

```clojure
(+ 1 1 2 3 5 8)
;; user=> 20

(- 1 1 2 3 5 8)
;; user=> -18

(* 1 2 (* 5 8) 13)
;; user=> 1040

(/ 135 3)
;; user=> 45

(mod 3 2)
;; user=> 1

(min 21 13 8 5 3 2 1 1)
;; user=> 1

(max 1 1 2 3 5 8 13 21)
;; user=> 21
```

## Strings

Creating strings in Clojure is very simple, you only need "double quotes".

```clojure
"I'm a String"
;; user=> "I'm a String"
```

### str

Clojure's structure is very simple and consistent by comparison facilitating string "concatenation" as already shown.

```clojure
(str "I'm " "new!")
;; user=> "I'm new!"
```

### format

Like many other languages, Clojure supports string formatting with format `function`.

| Format specifier | Type |
| :---  | :--- |
| `%s`    | String |
| `%d`   | Integer |
| `%.Nf`  | Floating numbers, where N specifies how floating points |
| `%b`    | Boolean |

```clojure
(format "Welcome to %s" "Clojure!")
;; user=> "Welcome to Clojure!"

(format "This is the %dnd day of %s" 2 "Clojure")
;; user=> "This is the 2nd day of Clojure"

(format "Φ: %.2f" 1.61803398875)
;; user=> "Φ: 1.62"

(format "Φ: %.7f" 1.61803398875)
;; user=> "Φ: 1.6180340"

(format "if (= 2 (+ 1 1)) returns %b" true)
;; user=> "if (= 2 (+ 1 1)) returns true"
```

## Test your knowledge

- Using the REPL, compute the sum of `112358` and `424956`.
- Rewrite the following algebraic expression as a Clojure expression: `(7 + 3 * 10 + 5) / 14`.
- Format the phrase "Create simple solutions and make experiences unique" with the `format` function for the words "simple" and "unique".


## Day 3 - Control flow and Recursion
[See more](/day3)

---

## License

This project is licensed under the MIT License.

[![License](http://img.shields.io/:license-mit-black.svg?style=flat-square)](http://badges.mit-license.org)
