(defproject migrator "0.1.0-SNAPSHOT"
  :description "Migrator is a SQL migration library written in Clojure"
  :url "https://github.com/azapps/clj-migrator"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/java.jdbc "0.4.1"]
                 [org.postgresql/postgresql "9.4-1201-jdbc41"]
                 [lobos "1.0.0-beta3"]]
  :target-path "target/%s"
  :repositories [["snapshots" {:url "https://maven.azapps.de/artifactory/mirakeldb-snapshots"
                               :username :env
                               :password :env}]
                 ["releases" {:url "https://maven.azapps.de/artifactory/mirakeldb-releases"
                              :username :env
                              :password :env}]]
  :profiles {:uberjar {:aot :all}})
