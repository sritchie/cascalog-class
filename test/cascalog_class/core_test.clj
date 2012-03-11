(ns cascalog-class.core-test
  (:use cascalog-class.core
        [midje sweet cascalog]))

(let [line-src [["a line of text line many"]
                ["words line count line text"]]]
  (fact
    "When passed a generator of textlines, wordcount-query will
    return a sequence of 2-tuples of the form <word, count>"
    (wordcount-query line-src) => (produces [["a" 1]
                                             ["count" 1]
                                             ["line" 4]
                                             ["many" 1]
                                             ["of" 1]
                                             ["text" 2]
                                             ["words" 1]])))
