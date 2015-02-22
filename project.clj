(defproject embedded-kafka "0.2.0-SNAPSHOT"
  :description "Helpers to run an embedded Kafka Broker"
  :plugins [[s3-wagon-private "1.1.2"]]
  
                             
                             
                             
  :url "https://github.com/Mayvenn/embedded-kafka"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [commons-io/commons-io "2.4"]
                 [clj-kafka "0.2.8-0.8.1.1"]]
  :profiles
  {:dev {:source-paths ["dev"]
         :dependencies [[pjstadig/humane-test-output "0.6.0"]
                        [org.clojure/tools.namespace "0.2.9"]]
         :injections [(require 'pjstadig.humane-test-output)
                      (pjstadig.humane-test-output/activate!)]}})
