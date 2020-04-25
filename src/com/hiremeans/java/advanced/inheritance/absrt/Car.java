package com.hiremeans.java.advanced.inheritance.absrt;

public abstract class Car {

    public Integer getCarPrice(){
        return 30000;
    }

    public Integer getModelYear(Integer modelYear) {
        return modelYear + 1;
    }

    public abstract String getCarName(String name);

    public abstract Integer noOfSeats(Integer seats);



}
