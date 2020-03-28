package com.hiremeans.java.advanced.objects.learning;

import java.util.Scanner;

/**
 *  Acceptance criteria
 *
 * Color
 * Price
 * ModelYear
 * Seats
 * OwnerName
 *
 * Create a method :
 *
 * calculateMonthlyInstallmentsforFiveYears
 *
 * changeTheOwnerName if model year is before 2012
 *
 *
 */

public class CarAdvanced {

    double downPayment;
    String color;
   double price;
   Integer year;
   Integer seats;
   String ownerName;

   //constructor

    public CarAdvanced(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your full name : ");
         this.ownerName = scanner.nextLine();

        System.out.println("Please enter the price : ");
         this.price = scanner.nextDouble();

        System.out.println("Please enter the amount you want to provide as down payment.");
         this.downPayment = scanner.nextDouble();

        System.out.println("Please enter the year :");
        this.year = scanner.nextInt();

        System.out.println("Please enter the color");
        this.color = scanner.next();

        this.seats = 5;

    }


   public double calculateMonthlyPayment(double downPayment){

       if(price > 0) {
           double balance = price - downPayment;
           double monthlyPayment = balance / 60; //five year payments per month
           return monthlyPayment;
       }

       return 0.0;

   }

   public String changeTheOwnerName(String newOwnerName){
       if(year > 2012){
           this.ownerName = newOwnerName;

           return "Owner name has been changed to : " + this.ownerName;
       }

       return "Since model year is not greater than 2012, owner name cannot be changed!!";


   }






}
