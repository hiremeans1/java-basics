package com.hiremeans.java.advanced.objects.learning;

public class BoxObjects {

    public static void main(String[] args) {
        Box ups = new Box();

        Box fedex = new Box();

        ups.length = 20;
        ups.width = 30;
        ups.cost = 40.45;


        int upsArea = ups.calculateArea(10);

        System.out.println("ups box total area is :  " +upsArea +" and the cost is : " + ups.cost);

        fedex.width = 40;
        fedex.length = 50;
        //fedex.cost = 60.12;

        int fedexArea = fedex.calculateArea(20);

        System.out.println("Fedex box total area is : " + fedexArea);



    }
}
