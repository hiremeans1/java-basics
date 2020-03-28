package com.hiremeans.java.advanced.objects.learning;

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

public class Car {

   String color;
   double price;
   Integer year;
   Integer seats;
   String ownerName;


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
