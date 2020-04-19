package com.hiremeans.java.advanced.inheritance;

public class TestBox {

    public static void main(String[] args) {

        NewBox fedex = new NewBox("Fedex");
        fedex.calculateArea(3,4);
        fedex.calculateVolume(5,12,10);
        fedex.price();
        fedex.boxOrigin();

        Box ups = new Box();
        ups.calculateAreaOfCircle(30);


    }
}
