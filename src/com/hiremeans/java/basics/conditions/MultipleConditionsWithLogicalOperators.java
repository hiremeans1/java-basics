package com.hiremeans.java.basics.conditions;

import java.util.Scanner;

public class MultipleConditionsWithLogicalOperators {

    /**
     *
     *
     * logical operators are electronics terms  && (AND operator), || (OR operator)
     *
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first favorite place to visit in any continent!!");

        String firstPlace = scanner.next();

        System.out.println("Please enter your second favorite place to visit in any continent!!");

        String secondPlace = scanner.next();

        if(firstPlace.equals("England") && secondPlace.equals("Switzerland")){

            System.out.println("Syed's favorite places to visit in Europe!! "+"firstPlace is " +firstPlace +", " +secondPlace);


        }else if(firstPlace.equals("Holland") && secondPlace.equals("Spain")){
            System.out.println("Asif's favorite places to visit in Europe!! "+"firstPlace is " +firstPlace +", " +secondPlace);

        }else if(firstPlace.equals("France") && secondPlace.equals("Denmark")){
            System.out.println("Peter's favorite places to visit in Europe!!"+firstPlace +", " +secondPlace);
        } else{
            System.out.println("We couldn't find your favorite places in any continent!!");
        }

        // to use the OR logical operator!!

        if(firstPlace.equals("England") || secondPlace.equals("Switzerland")){

            if(firstPlace.equals("England")) {
                System.out.println("Syed's first favorite place to visit in Europe!!" + firstPlace);
            }

            if(secondPlace.equals("Switzerland")) {
                System.out.println("Syed's second favorite place to visit in Europe!!" + secondPlace);
            }


        }



    }



}
