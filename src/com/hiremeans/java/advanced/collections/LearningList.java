package com.hiremeans.java.advanced.collections;

import java.util.ArrayList;


public class LearningList {

    public static void main(String[] args) {

        ArrayList<String> listOfCountryNames = new ArrayList();

        listOfCountryNames.add("USA");
        listOfCountryNames.add("Canada");
        listOfCountryNames.add("India");
        listOfCountryNames.add("Brazil");
        listOfCountryNames.add("Kenya");


        System.out.println("Size of the list is : " + listOfCountryNames.size());

       /* for (int i = 0; i < listOfCountryNames.size() ; i++) {

            System.out.println(listOfCountryNames.get(i));

        }*/

        /**
            syntax of the For-Each loop

             for(typeOfTheList variable : listName){

                 // use the variable to perform the logic

            }
         */
        listOfCountryNames.remove("Canada");
        System.out.println("new List size : "+listOfCountryNames.size());
        for(String name : listOfCountryNames){
            System.out.println(name);
        }





    }

}
