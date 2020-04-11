package com.hiremeans.java.advanced.collections;

import java.util.HashSet;
import java.util.Set;

public class LearningSet {


    public static void main(String[] args) {


        /**
         *
         *   syntax of set
         *
         *   Set<type> variable = new HashSet<>();
         *
         *
         *
         */


        Set<String> setOfCountryNames = new HashSet<>();

        setOfCountryNames.add("Canada");
        setOfCountryNames.add("USA");
        setOfCountryNames.add("France");
        setOfCountryNames.add("Japan");
        setOfCountryNames.add("Brazil");
        setOfCountryNames.add("Canada");
        setOfCountryNames.add("India");



        for (String countryName : setOfCountryNames) {

            System.out.println(countryName);

        }




    }




}