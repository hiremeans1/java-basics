package com.hiremeans.java.basics.conditions;

public class StringLearning {

    public static void main(String[] args) {

        String name = "Foo Bar";

       /* Equals method to compare two values of different objects, its returns true if values
        of 2 objects are equal, otherwise it returns false.*/
        System.out.println(name.equals("Foo Bar"));

        //equalsIgnore
        System.out.println(name.equalsIgnoreCase("foo bar"));


        // get the substrings with the index values of your String
        System.out.println(name.substring(2));

        System.out.println(name.substring(1,5));

        System.out.println(name.charAt(4));


        // to convert string to upper/lower case

        System.out.println(name.toLowerCase());

        System.out.println(name.toUpperCase());

        System.out.println("String is Immutable class, so before assigning the value explicitly");

        System.out.println(name);

        System.out.println("To change the value of String, after assigning the value explicitly");
        name = name.toUpperCase();

        System.out.println(name);


        // to add the string to the existing string

        //String cityAndState = " is livig in United States";

        System.out.println(name+" is livig in United States");




    }

}
