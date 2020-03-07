package com.hiremeans.java.basics.conditions;

public class ConditionsWithIfElse {

    public static void main(String[] args) {
        int y = 20;

        if(y>=12){
            System.out.println("Y is greater than or equals to 12");
        }else if(y>=8){
            System.out.println("Y is greater than or equals to 8");
        }else if(y>=6){
            System.out.println("Y is greater than or equals to 6");
        }else{
            System.out.println("all if conditions failed");
        }

        String name = "foo bar";

        if(name == "foo bar"){
            System.out.println("name is equals to foo bar");
        }else{
            System.out.println("name is not equal to foo bar");
        }

    }




}
