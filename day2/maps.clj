(ns seven-days-of-clojure.maps)

{}

{:id "abcd-1234"
 :title "My Map"
 :color "aqua"
 :author {:id "dcba-4321"
          :name "@me"}}

{:language "Clojure"
 :version "1.10.0"
 :author "Rich Hickey"
 :year 2007}

 (get {:id "abcd-1234"
  :title "My Map"
  :color "aqua"
  :author {:id "dcba-4321"
            :name "@me"}} :color)

;; get
(get {:language "Clojure"
  :version "1.10.0"
  :author "Rich Hickey"
  :year 2007} :language)

;; assoc
(assoc {:language "Clojure"
  :version "1.10.0"
  :author "Rich Hickey"
  :year 2007} :dialect "Lisp")

(assoc {:id "abcd-1234"
  :title "My Map"
  :color "aqua"
  :author {:id "dcba-4321"
            :name "@me"}} :title "My new Map")

;; merge
(merge {:a "a"} {:b "b"})

(merge {:id "0123-defg"
        :name "Map"} {:keys {:id :name}})

;; keys
(keys {:id "abcd-1234"
  :title "My Map"
  :color "aqua"
  :author {:id "dcba-4321"
           :name "@me"}})

;; vals
(vals {:language "Clojure"
  :version "1.10.0"
  :author "Rich Hickey"
  :year 2007})
