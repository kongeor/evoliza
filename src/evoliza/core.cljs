(ns evoliza.core
  (:require [reagent.core :as r]
            [reagent.dom :as rd]))

(defn home []
  [:p "yes!!!!!"])

(defn ^:export main []
  (rd/render [home]
            (.getElementById js/document "app")))

(main)