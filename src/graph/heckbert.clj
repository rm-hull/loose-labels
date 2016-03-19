(ns graph.heckbert)

(defn nice-num
  "Find a “nice” number approximately equal to x.
  Round the number if round = true, take ceiling if round = false."
  [x round]
  {:pre [(>= x 0)]}
  (let [exp (Math/floor (Math/log10 x))
        f   (/ x (Math/pow 10 exp))
        nf  (if round
              (condp > f
                1.5  1.0
                3.0  2.0
                7.0  5.0
                10.0)
              (condp >= f
                1.0  1.0
                2.0  2.0
                5.0  5.0
                10.0))]
    (* nf (Math/pow 10, exp))))

(defn loose-label
  "Label the data range from lower to upper loosely."
  ([lower upper] (loose-label lower upper 5))
  ([lower upper ntick]
    {:pre [(>= ntick 2) (< lower upper)]}
    (let [rng      (nice-num (- upper lower) false)
          d        (nice-num (/ rng (dec ntick)) true)
          graphmin (* (Math/floor (/ lower d)) d)
          graphmax (* (Math/ceil (/ upper d)) d)
          nfrac    (int (max (- (Math/floor (Math/log10 d))) 0))
          fmt-meta (partial format (str "%." nfrac "f"))]
      (->>
        (range graphmin (+ graphmax (* 0.5 d)) d)
        (map fmt-meta)))))

(defn values [labels]
  (map #(Double/parseDouble %) labels))
