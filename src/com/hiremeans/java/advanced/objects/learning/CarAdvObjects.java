package com.hiremeans.java.advanced.objects.learning;


/**
 *
 *    Pass inputs from the console using the system
 *
 *
 *
 *
 */

public class CarAdvObjects {

    public static void main(String[] args) {

        CarAdvanced toyotaCamry = new CarAdvanced();

        System.out.println(toyotaCamry.ownerName + ", monthly payment would be :"
                                   + toyotaCamry.calculateMonthlyPayment(toyotaCamry.downPayment));
        System.out.println(toyotaCamry.changeTheOwnerName("Liz Perry"));

       /* Car hondaAccord = new Car();

        System.out.println(hondaAccord.ownerName + ", monthly payment would be :"+toyotaCamry.calculateMonthlyPayment(2000.00));
        System.out.println(hondaAccord.changeTheOwnerName("John Rudder"));*/




    }




}
