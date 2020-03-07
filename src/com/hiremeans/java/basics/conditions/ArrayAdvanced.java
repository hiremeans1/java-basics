package com.hiremeans.java.basics.conditions;

public class ArrayAdvanced {

    public static void main(String[] args) {

        String[] names = {"Peter","Andreen","Asif","Syed"};


        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("---------------------------------------------------");

        //array with fixed size

        String[] countryNames = new String[6];

        countryNames[0] = "USA";
        countryNames[1] = "Canada";
        countryNames[2] = "France";
        countryNames[3] = "Japan";
        countryNames[4] = "India";
        countryNames[5] =  "Bangladesh";


        for (int i = 0; i < countryNames.length; i++) {

            System.out.println(countryNames[i]);

        }

    }

}
