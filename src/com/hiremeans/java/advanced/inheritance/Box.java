package com.hiremeans.java.advanced.inheritance;

public class Box {

    int height;
    int width;

    Box(){
        height = 200;
        System.out.println("Box has been created!!");
    }

    Box(int width){
        this.width = width;
    }

    public void calculateArea(int length, int width){
        calculateVolume(length,width,height);

    }

    public void calculateVolume(int length, int width, int height){
        System.out.println("volume = " + (length * width * height));
    }

    public int calculateAreaOfCircle(int radius){
        return 22/7 * radius * radius;
    }


}
