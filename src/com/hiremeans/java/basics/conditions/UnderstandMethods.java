package com.hiremeans.java.basics.conditions;

import java.time.LocalDateTime;

public class UnderstandMethods {

    public Integer myName(Integer passedValue){
        return passedValue - 100;
    }

    public Integer multiply(Integer a, Integer b){
        return a * b;
    }

    public boolean isFirstNumberGreaterThanSecond(Integer a, Integer b){

        if(a>b){
            return true;
        }else{
            return false;
        }
    }

    public LocalDateTime getCurrentLocalDateTime(){
        return LocalDateTime.now();
    }


}
