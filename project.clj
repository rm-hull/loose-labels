(defproject rm-hull/loose-labels "0.1.0"
  :description "An implementation of \"Nice numbers for graph labels\" from Graphics Gems, vol. 1, in Clojure"
  :url "https://github.com/rm-hull/loose-labels"
  :license {
    :name "The MIT License (MIT)"
    :url "http://opensource.org/licenses/MIT"}
  :dependencies [ ]
  :scm {:url "git@github.com:rm-hull/loose-labels.git"}
  :source-paths ["src"]
  :jar-exclusions [#"(?:^|/).git"]
  :codox {
    :source-paths ["src"]
    :doc-files [
      "doc/background.md"
      "doc/basic-usage.md"
      "doc/references.md"
      "LICENSE.md"
    ]
    :output-path "doc/api"
    :source-uri "http://github.com/rm-hull/loose-labels/blob/master/{filepath}#L{line}" }
  :min-lein-version "2.8.1"
  :profiles {
    :dev {
      :global-vars {*warn-on-reflection* true}
      :dependencies [
        [org.clojure/clojure "1.9.0"]
        [org.clojure/test.check "0.9.0"]]
      :plugins [
        [lein-codox "0.10.5"]
        [lein-cljfmt "0.6.1"]
        [lein-cloverage "1.0.13"]]}})
