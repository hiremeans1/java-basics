package com.hiremeans.java.advanced.interfaces;

import java.io.Serializable;
import java.util.List;

public class Word implements Office {


    @Override
    public void save() {
        System.out.println("Saving the word document!1");
    }

    @Override
    public void delete() {
        System.out.println();
    }

    @Override
    public void open() {

    }

    @Override
    public void New() {

    }
}
