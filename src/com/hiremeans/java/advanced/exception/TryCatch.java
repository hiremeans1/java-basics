package com.hiremeans.java.advanced.exception;

public class TryCatch {

    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        int[] numbers = {0,1, 2, 3, 4, 5, 6, 7};
        /***
         *
         * syntax of try-catch
         *
         * try{
         *      // block of code you want to execute
         *
         *      }catch(Exception class  or subclass of exception class variable){
         *        // after catching the exception, print out or log the exception
         *      }
         */
        try {
             System.out.println(a/b);
             for (int i = 0; i <= numbers.length; i++) {
                 System.out.println(numbers[i]);
             }

         }catch (ArithmeticException ex){
            ex.printStackTrace();
         }catch(ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace();
        }finally {
            System.out.println("This will always run!!");
        }

        System.out.println("My favorite number is : " + numbers[4]);

        if (numbers[6] == 6) {
            System.out.println("Value of numbers at 6th index is right!!");
        }



    }



}
