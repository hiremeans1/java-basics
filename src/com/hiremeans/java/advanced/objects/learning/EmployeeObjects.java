package com.hiremeans.java.advanced.objects.learning;

public class EmployeeObjects {


    public static void main(String[] args) {

        Employee e1 = new Employee();

        Employee e2 = new Employee();

        Employee e3 = new Employee();


        e1.firstName = "Alex";
        e1.lastName = "Agostino";
        e1.salary = 10000;
        e1.bonus = 2000;

        e2.firstName = "John";
        e2.lastName = "Adams";
        e2.salary = 15000;
        e2.bonus = 1000;

        e3.firstName = "Linda";
        e3.lastName = "Perry";
        e3.salary = 20000;
        e3.bonus = 4000;


        System.out.println(e3.firstName + " total salary is : " + e3.calculateTotalSalary());

        System.out.println(e1.firstName + " total salary is : " + e1.calculateTotalSalary());

        System.out.println(e2.firstName + " total salary is : " + e2.calculateTotalSalary());






    }

}
