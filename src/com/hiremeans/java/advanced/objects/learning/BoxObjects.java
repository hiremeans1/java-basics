package com.hiremeans.java.advanced.objects.learning;

public class BoxObjects {

    public static void main(String[] args) {
        Box ups = new Box();

        Box fedex = new Box();

        ups.length = 20;
        ups.width = 30;
        ups.cost = 40.45;

        int upsHeight = 30;
        int upsArea = ups.calculateArea(upsHeight);

        System.out.println("ups box total area is :  " +upsArea +" and the cost is : " + ups.cost);

        fedex.width = 40;
        fedex.length = 50;
        //fedex.cost = 60.12;

        int fedexArea = fedex.calculateArea(20);

        System.out.println("Fedex box total area is : " + fedexArea);


        Box usps = new Box();

        usps.length = 35;
        usps.width = 25;
        usps.cost = 23.2;

        int uspsBoxArea = usps.calculateArea(0);

        System.out.println(usps.description + ", usps box area is : " + uspsBoxArea);



    }
}
