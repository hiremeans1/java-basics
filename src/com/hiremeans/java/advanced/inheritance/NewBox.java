package com.hiremeans.java.advanced.inheritance;


import com.hiremeans.java.advanced.interfaces.Excel;

public class NewBox extends Box {

    String name;

    NewBox(){
        super(120);
        //default
    }

    NewBox(String name){
       this.name = name;
    }

    @Override
    public void calculateArea(int length, int width){
        System.out.println("Name of the box is : " + name);
        calculateVolume(length,width,height * 10);

    }





    public void boxOrigin(){
        System.out.println("United States");
    }

    public void price(){
        System.out.println("box price is : " +120);
    }


}
