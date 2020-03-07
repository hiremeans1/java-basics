package com.hiremeans.java.basics.conditions;

public class DifferenceEqualsAndEqualOperator {

    public static void main(String[] args) {
        String name = new String("foo bar"); //String object 1
        String anotherName = new String("foo bar");  //String object 2

        System.out.println("With equal operator : ");
        System.out.println(name == anotherName);

        System.out.println("With String Equals method :  "+name.equals(anotherName));


    }
}
