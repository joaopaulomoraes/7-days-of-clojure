(ns seven-days-of-clojure.arity-variable)

(defn hello
  [guy]
  (str "Hello, " guy "!"))

(defn bot-codger
  [& guys]
    (map hello guys))

(bot-codger "John" "Nathan" "Tony")
