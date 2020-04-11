package com.hiremeans.java.advanced.objects.learning;

public class UserObjects
{

    public static void main(String[] args) {


        User user1 = new User("John",1, "123 xyz street",120);



        User user2 = new User("Alex",2,"1245 xyz", 110);




        System.out.println(user1.getUserName() + " id is : "+user1.getUserId() + ", address is : " + user1.getAddress() +", salary is : "+user1.getSalary() );







    }


}
