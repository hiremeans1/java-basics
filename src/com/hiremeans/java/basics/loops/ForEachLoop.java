package com.hiremeans.java.basics.loops;

public class ForEachLoop {

    public static void main(String[] args) {

        int[] numbers = {12,24,12,4,6,54,343,232,544,6,7,678,6543,43,32,32,3};

        System.out.println("Printing out th event numbers form the above array!!");

        // Enhanced for loop or for each loop

        for ( int as : numbers) {
            // achieve the even numbers from the above array!!
            if(as % 2 == 0) {
                System.out.println(as);
            }
        }
        System.out.println("--------Printing out th odd numbers form the above array!! -----");
        for ( int as : numbers) {
            // achieve the odd numbers from the above array!!
            if(as % 2 != 0) {
                System.out.println(as);
            }
        }


    }


}
