package com.hiremeans.java.basics.conditions;

public class ReverseString {

    public String reverseString(String input){

        String reverseString = "";
        if(input != null){

            for (int i=input.length()-1; i>=0;i--) {

                reverseString = reverseString + input.charAt(i);

            }

        }
        return reverseString;
    }

}
