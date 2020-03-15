package com.hiremeans.java.basics.learning;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxingAndUnBoxing {

/**
 *
 *
 * Autoboxing:  Autoboxing is automatic conversion of the primitive data type to its corresponding wrapper classes.
 *
 * Unboxing : Converting the wrapper class value to the primitive type.
 *
 * for Ex:  converting int to an Integer
 *
 *  a char to a Character and so on
 *
 */



/***
 *
 *    Autoboxing, Unboxing
 *
 *    primitive type  ->  Wrapper class
 *      int           ->   Integer
 *      double        ->   Double
 *      long          ->   Long
 *      float         ->   Float
 *      short         ->   Short
 *      char          ->  Character
 *      boolean       ->  Boolean
 *
 *
 */

    public static void main(String[] args) {


        Integer[] numbers = new Integer[5];
        int j = 2;
        for(int i =0; i<5 ; i++){
            numbers[i] = j;
            j = j+2;
            System.out.println(numbers[i]);
        }

        // Unboxing

        int y = 200;

        Integer wrapperValueOfY = y;

        System.out.println(wrapperValueOfY);
    }



}
