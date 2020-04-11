package com.hiremeans.java.advanced.objects.learning;

public class User {

    private Integer userId;
    private String userName;
    private String address;
    private double salary;

    public User() {
        //default constructor
    }

    public User(String userName, Integer userId, String address, double salary){
        this.userId = userId;
        this.userName = userName;
        this.address = address;
        this.salary = salary;

    }


    public double calculateSalary(){
        return salary + 10000;
    }


    private static class SubUser{

    }

    public Integer getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }



}
