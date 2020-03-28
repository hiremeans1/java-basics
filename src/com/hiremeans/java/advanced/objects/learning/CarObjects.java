package com.hiremeans.java.advanced.objects.learning;

import java.util.Scanner;

public class CarObjects {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Car toyotaCamry = new Car();

        toyotaCamry.ownerName = "Kevin";
        toyotaCamry.color = "White";
        toyotaCamry.price = 22036.45;
        toyotaCamry.year = 2019;
        toyotaCamry.seats = 5;

        System.out.println(toyotaCamry.ownerName + ", monthly payment would be :"+toyotaCamry.calculateMonthlyPayment(10000.00));
        System.out.println(toyotaCamry.changeTheOwnerName("Liz Perry"));

        Car hondaAccord = new Car();
        hondaAccord.ownerName = "David";
        hondaAccord.color = "Black";
        hondaAccord.year = 2008;
        hondaAccord.seats = 5;
        hondaAccord.price = 10567.29;

        System.out.println(hondaAccord.ownerName + ", monthly payment would be :"+toyotaCamry.calculateMonthlyPayment(2000.00));
        System.out.println(hondaAccord.changeTheOwnerName("John Rudder"));




    }




}
