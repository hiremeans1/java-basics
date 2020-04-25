package com.hiremeans.java.advanced.inheritance.absrt;

public class TestCars {

    public static void main(String[] args) {
        Ford focus = new Ford();
        String name = focus.getCarName("Focus 200");
        System.out.println(name);
        System.out.println(focus.noOfSeats(2));
        System.out.println(focus.getCarPrice());
    }
}
