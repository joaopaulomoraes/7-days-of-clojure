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

## Boolean

In Clojure, everything except `false` and `nil` are `true`.

```clojure
(boolean false)
;; user=> false

(boolean nil)
;; user=> false

(boolean 0)
;; user=> true

(boolean 1)
;; user=> true

(boolean "A simple string")
;; user=> true

(boolean :property)
;; user=> true
```

## Lists

A list is a simple collection of values ​​by grouping values ​​in parentheses with `'` (single quote) at the beginning.

```clojure
'(:a :b :c)
;; user=> (:a :b :c)

'(0 1 1 2 3)
;; user=> (0 1 1 2 3)

'(7 "days" :clojure)
;; user=> (7 "days" :clojure)
```

### conj

`conj` is used to add values to a list.

```clojure
(conj '(1 2 3) 1 0)
;; user=> (0 1 1 2 3)

(conj '("days" "of" "Clojure") :days 7)
;; user=> (7 :days "days" "of" "Clojure")

(conj '("i" "s" "t") "l")
;; user=> ("l" "i" "s" "t")
```

Note that the new value is added to the top.

### remove elements

Since Clojure follows the functional programming paradigm, data should not be mutated, so there is no built-in function to do this. But you can still use seq library functions, such as `remove`, `filter`, or `drop`.

You can learn more [here](https://clojure.org/reference/sequences).

### nth

To get a value from the list, use `nth` with its index number. As in another language, the index starts at 0 in Clojure.

```clojure
(nth '(1 2 3 5 8) 1)
;; user=> 2

(nth '(1 2 3 5 8) 0)
;; user=> 1

(nth '(1 2 3 5 8) 3)
;; user=> 5
```

### count

Use `count` to get the amount of values in a list.

```clojure
(count '(:a :b :c 1 5 13 "d" "e"))
;; user=> 8

(count '(7 14 21))
;; user=> 3

(count '())
;; user=> 0
```

## Vectors

Vectors are similar to lists, except for adding new elements at the end.

### conj

```clojure
(conj [0 9 8 7 6 5] 4)
;; user=> [0 9 8 7 6 5 4]

(conj [:a :b "c"] 5)
;; user=> [:a :b "c" 5]
```

Vectors also have convenient functions to access elements, like `first` and `second`.

```clojure
(nth [0 9 8 7 6 5] 4)
;; user=> 6

(first [:a :b "c"])
;; user=> :a

(last [0 1 1 3 "I'm last"])
;; user=> "I'm last"
```

## Maps

Maps are key-value data structure to store multiple values.

```clojure
{}
;; user=> {}

{:id "abcd-1234"
 :title "My Map"
 :color "aqua"
 :author {:id "dcba-4321"
          :name "@me"}}
;; user=> {:id "abcd-1234", :title "My Map", :color "aqua", :author {:id "dcba-4321", :name "@me"}}

{:language "Clojure"
 :version "1.10.0"
 :author "Rich Hickey"
 :year 2007}
;; user=> {:language "Clojure", :version "1.10.0", :author "Rich Hickey", :year 2007}
```

### get

To get value from key, use `get`.

```clojure
(get {:id "abcd-1234"
      :title "My Map"
      :color "aqua"
      :author {:id "dcba-4321"
                :name "@me"}} :color)
;; user=> "aqua"

(get {:language "Clojure"
      :version "1.10.0"
      :author "Rich Hickey"
      :year 2007} :language)
;; user=> "Clojure"
```

### assoc

To add a key-value pair, use `assoc`, but note that if the value already exists, it will be replaced.

```clojure
(assoc {:language "Clojure"
        :version "1.10.0"
        :author "Rich Hickey"
        :year 2007} :dialect "Lisp")
;; user=> {:language "Clojure", :version "1.10.0", :author "Rich Hickey", :year 2007, :dialect "Lisp"}

(assoc {:id "abcd-1234"
        :title "My Map"
        :color "aqua"
        :author {:id "dcba-4321"
                  :name "@me"}} :title "My new Map")
;; user=> {:id "abcd-1234", :title "My new Map", :color "aqua", :author {:id "dcba-4321", :name "@me"}}
```

### merge

Use `merge` to combine maps.

```clojure
(merge {:a "a"} {:b "b"})
;; user=> {:a "a", :b "b"}

(merge {:id "0123-defg"
        :name "Map"} {:keys {:id :name}})
;; user=> {:id "0123-defg", :name "Map", :keys {:id :name}}
```

### keys

`keys` is used to get all keys from a map.

```clojure
(keys {:id "abcd-1234"
       :title "My Map"
       :color "aqua"
       :author {:id "dcba-4321"
                :name "@me"}})
;; user=> (:id :title :color :author)
```

### vals

`vals` is used to get all values from a map.

```clojure
(vals {:language "Clojure"
       :version "1.10.0"
       :author "Rich Hickey"
       :year 2007})
;; user=> ("Clojure" "1.10.0" "Rich Hickey" 2007)
```

## Test your knowledge

- Using the REPL, compute the sum of `112358` and `424956`.
- Rewrite the following algebraic expression as a Clojure expression: `(7 + 3 * 10 + 5) / 14`.
- Format the phrase "Create simple solutions and make experiences unique" with the `format` function for the words "simple" and "unique".
- Build your imagination.

## Day 3 - Control flow and Recursion
[See more](/day3)

---

## License

This project is licensed under the MIT License.

[![License](http://img.shields.io/:license-mit-black.svg?style=flat-square)](http://badges.mit-license.org)
