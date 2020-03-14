package com.hiremeans.java.basics.conditions;

public class ReverseStringTest {

    public static void main(String[] args) {

        ReverseString rs = new ReverseString();

        String reverseStrOfUnitedStates = rs.reverseString("United States");

        String revStrOfCanada = rs.reverseString("Canada");


        System.out.println(reverseStrOfUnitedStates + "   " + revStrOfCanada);

    }
}
