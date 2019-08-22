(ns seven-days-of-clojure.case)

(case 5
  5 "c is 5"
  10 "c is 10")

(case (inc 7)
  1 "macOS"
  2 "Linux"
  3 "Windows"
  "Confused Travolta GIF")
