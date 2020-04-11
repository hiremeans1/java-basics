package com.hiremeans.java.advanced.collections;

import com.hiremeans.java.advanced.objects.learning.Person;
import com.hiremeans.java.advanced.objects.learning.User;

import java.util.ArrayList;
import java.util.List;


public class LearningList {

    public static void main(String[] args) {

        // Syntax or how to create a list

        List<Integer> listOfImpNumbers = new ArrayList<>();

        listOfImpNumbers.add(125);
        listOfImpNumbers.add(375);
        listOfImpNumbers.add(875);
        listOfImpNumbers.add(90);
        listOfImpNumbers.add(89);

        for (Integer listOfImpNumber : listOfImpNumbers) {
            System.out.println(listOfImpNumber);
        }



        ArrayList<String> listOfCountryNames = new ArrayList();

         // to add new elements into the list, call add function/method from the list

        // to retrieve the elements, call get(index) function/method from the list

        listOfCountryNames.add("USA");
        listOfCountryNames.add("Canada");
        listOfCountryNames.add("India");
        listOfCountryNames.add("Brazil");
        listOfCountryNames.add("Kenya");
        listOfCountryNames.add("Japan");
        listOfCountryNames.add("France");
        listOfCountryNames.add("Canada");
        listOfCountryNames.add("Italy");


        //  syntax of enhanced for loop or for-each loop

        /***

        for(typeOfThelist variable : nameOFTheList){

             apply the logic using variable.

         }


         **/

        System.out.println("----------------- Using for-each loop iterating the list -----------------------");

        for(String anything : listOfCountryNames ){

            System.out.println(anything.toUpperCase() + " length of this name is : " + anything.length());

        }


         // using the primitive for loop

        System.out.println("Size of the list is : " + listOfCountryNames.size());

        for (int i = 0; i < listOfCountryNames.size() ; i++) {

            System.out.println(listOfCountryNames.get(i) + " at index " + i);

        }



        // List of custom type

        System.out.println("--------------- List of custom type ---------------");
        Person person1 = new Person("John",28);


        List<Person> personList = new ArrayList<>();

        personList.add(person1);
        personList.add(new Person("Linda",20));

        for (Person person : personList) {

            System.out.println(person.getName() + " has age : " + person.caleAge());

        }








    }

}
