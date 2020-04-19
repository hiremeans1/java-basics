package com.hiremeans.java.advanced.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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



        Map<String,Integer> mapOfPersons = new HashMap<>();

        mapOfPersons.put("John",29);
        mapOfPersons.put("Alex", 35);
        mapOfPersons.put("Linda",45);
        mapOfPersons.put("John", 45);

        for(Map.Entry<String,Integer> mapofEntries : mapOfPersons.entrySet()){
            System.out.println(mapofEntries.getKey()+ " has value : "+mapofEntries.getValue());
            // System.out.println(mapofEntries.getKey());

        }
        mapOfPersons.remove("John");

        System.out.println("---------- after removing key from the map -------------");

        for(Map.Entry<String,Integer> mapofEntries : mapOfPersons.entrySet()){
            System.out.println(mapofEntries.getKey()+ " has value : "+mapofEntries.getValue());
            // System.out.println(mapofEntries.getKey());

        }








    }



}
