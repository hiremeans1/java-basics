package com.hiremeans.java.basics.switchStatement;

import com.hiremeans.java.basics.conditions.ReverseString;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwitchStatmentLearning {
    /**
     *  Syntax of switch statement
     *
     *  swtich(variable/value){
     *
     *      case someValue:
     *         //logic
     *      case anotherValue:
     *         // logic
     *      default:
     *        // logic
     *
     *
     *  }
     *
     *
     *
     */

    public static void main(String[] args) {

        Scanner inputValueFromKeyboard = new Scanner(System.in);

        System.out.println("Please enter the value between 0 - 20");

        Integer valueEntered = inputValueFromKeyboard.nextInt();

        switch (valueEntered){

            case 20:
                System.out.println(" entered value is " + valueEntered);
                break;
            case 15:
                System.out.println(" entered value is " + valueEntered);
                break;
            case 10:
                System.out.println(" entered value is " + valueEntered);
                break;
            case 5:
                System.out.println(" entered value is " + valueEntered);
                break;
            default:
                System.out.println(" entered value doesn't match any of the cases, value was " +
                                           "entered : " + valueEntered);

        }


        //  switch with string

        System.out.println("please enter your first name : ");

        String name = inputValueFromKeyboard.next();

        switch(name){

            case "Syed":
                ReverseString rs = new ReverseString();
                System.out.println(rs.reverseString(name));
                List<String> namesList = new ArrayList<>();
                namesList.add(name);
                break;
            case "Asif":
                System.out.println(name.toUpperCase());
                break;
            case "Peter":
                System.out.println("total length of peter's name is : " + name.length());
                break;
            default:
                System.out.println("Your name is not in the system, please try again later!!");



        }



    }




}
