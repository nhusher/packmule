(defproject packmule "0.1.0-SNAPSHOT"
  :description "REST APIs for something or another"
  :url "https://github.com/nhusher/packmule"

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [bidi "2.0.9"]
                 [compojure "1.3.4"]
                 [com.novemberain/monger "3.0.2"]
                 [com.taoensso/sente "1.8.1"]
                 [environ "1.0.3"]
                 [http-kit "2.1.19"]
                 [liberator "0.14.1"]
                 [ring "1.4.0"]
                 [ring/ring-defaults "0.2.0"]]

  :main packmule.core)
