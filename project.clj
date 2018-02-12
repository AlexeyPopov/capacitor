(defproject alexeypopov/capacitor "0.6.4-SNAPSHOT"
  :description "A Clojure client for InfluxDB fork"
  :url "https://github.com/AlexeyPopov/capacitor"
  :license {
            :name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
                 [org.clojure/clojure "1.9.0"]
                 [clj-http            "3.7.0"]
                 [cheshire            "5.8.0"]
                 [org.clojure/algo.generic "0.1.2"]]
  :plugins [
            [codox           "0.6.6"]]
  :dev-dependencies [
                     [codox "0.6.6"]]
  :codox {
          :output-dir "docs/codox"
          :src-dir-uri "https://github.com/olauzon/capacitor/blob/master/"
          :src-linenum-anchor-prefix "L"})
