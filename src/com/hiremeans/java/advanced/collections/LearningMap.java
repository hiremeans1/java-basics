package com.hiremeans.java.advanced.collections;

import java.util.HashMap;
import java.util.Map;

public class LearningMap {


    public static void main(String[] args) {

        /**
         *
         *    Map provides key-value pair
         *
         *    syntax to create a map
         *
         *    Map<typeOfKey,typeOfValue> variable = new HashMap<>();
         *
         *
         */


        Map<String,Integer> countryMapWithPopulation = new HashMap<>();

        countryMapWithPopulation.put("Canada",30);
        countryMapWithPopulation.put("USA", 350);
        countryMapWithPopulation.put("Brazil",120);
        countryMapWithPopulation.put("Italy",150);
        countryMapWithPopulation.put("Brazil",140);
        countryMapWithPopulation.put("Italy",160);

        System.out.println(countryMapWithPopulation.get("Italy"));
        System.out.println(countryMapWithPopulation.get("Canada"));







    }



}
