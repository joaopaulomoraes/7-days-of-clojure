(ns seven-days-of-clojure.lists)

'(:a :b :c)

'(0 1 1 2 3)

'(7 "days" :clojure)

;; conj
(conj '(1 2 3) 1 0)

(conj '("days" "of" "Clojure") :days 7)

(conj '("i" "s" "t") "l")

;; nth
(nth '(1 2 3 5 8) 1)

(nth '(1 2 3 5 8) 0)

(nth '(1 2 3 5 8) 3)

;; count
(count '(:a :b :c 1 5 13 "d" "e"))

(count '(7 14 21))

(count '())
