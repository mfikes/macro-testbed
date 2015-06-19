(ns foo.core
  (#?(:clj :require :cljs :require-macros)
    [foo.macros]))

(defn str->int [s]
  #?(:clj  (java.lang.Integer/parseInt s)
     :cljs (js/parseInt s)))

(defn add-five [s]
  (+ (str->int s) (foo.macros/str->int "5")))
