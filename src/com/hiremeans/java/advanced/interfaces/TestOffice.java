package com.hiremeans.java.advanced.interfaces;

public class TestOffice {


    public static void main(String[] args) {
        Word word = new Word();
        word.save();

        Excel excel = new Excel();
        excel.save();
    }
}
