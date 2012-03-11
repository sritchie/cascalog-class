(ns cascalog-class.core
  (:use cascalog.api)
  (:require [cascalog.ops :as c]))

(defmapcatop split
  "Accepts a sentence 1-tuple, splits that sentence on whitespace, and
   emits a single 1-tuple for each word."
  [^String sentence]
  (.split sentence "\\s+"))

(defn wordcount-query
  "Accepts a generator of lines of text and returns a subquery that
  generates a count for each word in the text sample."
  [src]
  (<- [?word ?count]
      (src ?textline)
      (split ?textline :> ?word)
      (c/count ?count)))
