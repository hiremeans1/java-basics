package com.hiremeans.java.advanced.interfaces;

public class Excel implements Office {


    @Override
    public void save() {
        System.out.println("Saving excel document!!");
    }

    @Override
    public void delete() {
        System.out.println("Deleting excel document!!");
    }

    @Override
    public void open() {

    }

    @Override
    public void New() {

    }
}
