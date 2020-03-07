package com.hiremeans.java.basics.conditions;

import java.util.Scanner;

public class TernaryOperator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your country name");
        String enteredCountryName = scanner.nextLine();
        /*String result = enteredCountryName == "United States" ? "yes I am in "+enteredCountryName :
                "I am not in"+enteredCountryName; */
        //including elseIf
        String result1 = enteredCountryName.equals("United States") ? "I am in United States"
                         : enteredCountryName.equals("India") ? "I am in India"
                         : enteredCountryName.equals("Canada") ? " I am in Canada"
                         : " I am outside of the world";
        String result = null;
        if(enteredCountryName.equals("United States")){
            result = "I am in United States";
        }else if(enteredCountryName.equals("India")){
            result = " I am in India";
        }else if(enteredCountryName.equals("Canada")){
            result = "I am in Canada";
        }
        else{
            result = "I am outside of the world";
        }
        System.out.println(result1);
    }
}
