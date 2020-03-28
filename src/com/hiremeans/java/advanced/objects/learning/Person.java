package com.hiremeans.java.advanced.objects.learning;

public class Person {

    String name;
    Integer age;

    Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    Person(){
        // no args constructor
    }



    String caleAge(){
        return "not available";
    }
}
