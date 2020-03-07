package com.hiremeans.java.basics.conditions;

public class ArrayBasics {

    public static void main(String[] args) {

        int[] myNumbers = {12, 24, 12, 56, 2, 43, 2};

        /*syntax of the for loop
        for(intialization;condition;increment/decrement){

        }
        */

        /*for(int i = 0;i<=6; i = i +1){

            System.out.println(myNumbers[i]);

        }*/
        // getting the values from the array using the length
       for(int i = 0;i<=myNumbers.length-1; i = i +1){

            System.out.println(myNumbers[i]);

        }

        System.out.println(" I have finished the loop");


    }


}
