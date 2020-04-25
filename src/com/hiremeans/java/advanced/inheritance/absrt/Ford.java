package com.hiremeans.java.advanced.inheritance.absrt;

public class Ford extends Car {

    @Override
    public String getCarName(String name) {
        return "Ford entity : " +name;
    }

    @Override
    public Integer noOfSeats(Integer seats) {
        return seats * 2;
    }
}
