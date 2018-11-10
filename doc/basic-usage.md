# Basic Usage

By default the labels are returned as strings formatted to the correct number of decimal places.

```clojure
(refer 'graph.heckbert :only '[loose-label values])

(loose-label 105.00 543.00)
; ("100" "200" "300" "400" "500" "600")
```

There is a convenience function to convert back into numeric values:

```clojure
(values (loose-label 105.00 543.00))
; (100.0 200.0 300.0 400.0 500.0 600.0)
```
