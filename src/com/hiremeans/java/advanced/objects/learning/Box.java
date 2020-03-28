package com.hiremeans.java.advanced.objects.learning;

public class Box {

    int length;
    int width;
    double cost;
    String description = "This is cutomized box";


    public int calculateArea(int height){
        if(height == 0){
            this.description = "Height was passed as 0";
        }
        int area = length * width * height;
        return area;
    }


}
