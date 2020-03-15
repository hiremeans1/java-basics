package com.hiremeans.java.basics.learning;

public class ConvertStringToInteger {


    /***
     *
     * Wrapper classes
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
     *
     * to convert one dataType to another type
     *
     * for Example : String to integer, double to integer, string to double
     *
     *
     *
     */

    public static void main(String[] args) {

        String perYearSalary = "10000.20";
        double salary = Double.parseDouble(perYearSalary); //converted the perYearSalary String to
        // double
        System.out.println(salary/12);

        String age = "75";

        System.out.println(Integer.parseInt(age) - 12); // converted the String value age to Integer value so we can apply mathematical operations on it


    }
}
