package com.hiremeans.java.advanced.exception;

public class HandleThrows {

    public static void main(String[] args) {

        CountryUtility countryUtility = new CountryUtility();

        Integer mpc = null;
        try {
            mpc = countryUtility.handleDivideByZero();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(mpc);


    }


}
