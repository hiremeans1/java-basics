package com.hiremeans.java.basics.conditions;

public class PracticeTest {

    public static void main(String[] args) {

        ReverseString rs = new ReverseString();
        UnderstandMethods um = new UnderstandMethods();

        String name = "USA";
        String value = name.equals("US") ? "United States" : "not in the list";

        System.out.println(rs.reverseString(name));
        System.out.println(um.myName(12));
        System.out.println(um.multiply(120,120));

        boolean result = um.isFirstNumberGreaterThanSecond(40,50);

        System.out.println(result);

        System.out.println(um.getCurrentLocalDateTime());

    }
}
