(ns seven-days-of-clojure.anonymous-function)

(fn [param]
  :body)

(def my-special-multiplier (fn [x] (* x 3)))

#(* % 3)

(#(* % 3) 8)

(map #(str "Hi, " %)
     ["Annonymous" "Function"])
