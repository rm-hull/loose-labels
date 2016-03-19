(ns graph.heckbert-test
  (:require
    [clojure.test :refer :all]
    [clojure.test.check.clojure-test :refer [defspec]]
    [clojure.test.check.generators :as gen]
    [clojure.test.check.properties :as prop]
    [graph.heckbert :refer :all]))

(def dbl-from-zero (gen/double* {:min 0 :NaN? false :infinite? false}))
(def dbl-from-one  (gen/double* {:min 1 :NaN? false :infinite? false}))
(def dbl-neg       (gen/double* {:NaN? false :infinite? false}))

(defspec nice-num-ceil
  100
  (prop/for-all [v dbl-from-zero]
    (is (>= (nice-num v false) v))))

;(defspec nice-num-neg-fails-precondition
;  100
;  (prop/for-all [v (gen/double* {:max 0})]
;    (is (thrown? AssertionError (nice-num v false) v))))

;(defspec loose-label-produces-max-ntick-plus-one-intervals
;  100
;  (prop/for-all [start gen/int
;                 delta gen/nat
;                 ntick (gen/choose 2 10)]
;    (is (>= (inc ntick) (count (loose-label start (+ start delta 1) ntick))))))

(defspec loose-label-lower-bound-inside-first-element
  100
  (prop/for-all [start gen/int
                 delta gen/nat]
    (is (>= start (first (values (loose-label start  (+ start delta 1))))))))

(defspec loose-label-upper-bound-inside-last-element
  100
  (prop/for-all [end gen/int
                 delta gen/nat]
    (is (<= end (last (values (loose-label (- end delta 1) end)))))))
