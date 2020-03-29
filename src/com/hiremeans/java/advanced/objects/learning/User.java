package com.hiremeans.java.advanced.objects.learning;

public class User {


    private Integer userId;
    private String userName;
    private String address;
    private double salary;

    public User() {

        //default constructor
    }



    public double calculateSalary(){
        return salary;
    }


    private static class SubUser{

    }

    // getters and setters


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
