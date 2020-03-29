package com.hiremeans.java.advanced.objects.learning;

public class UserObjects
{

    public static void main(String[] args) {


        User user1 = new User();

        user1.setUserId(123);
        user1.setAddress("1234 some street name, D.C");
        user1.setSalary(20000);
        user1.setUserName("Andrew");


        System.out.println(user1.getUserId());
        System.out.println(user1.getAddress());
        System.out.println(user1.getSalary());
        System.out.println(user1.getUserName());





    }


}
