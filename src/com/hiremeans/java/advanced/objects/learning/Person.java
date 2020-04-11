package com.hiremeans.java.advanced.objects.learning;

public class Person {

    String name;
    Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person(){
        // no args constructor
    }



    public Integer caleAge(){
        return age;
    }


    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
