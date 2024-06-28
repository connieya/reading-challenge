package org.example.item50;


import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date start = new Date();
        Date end = new Date();
        Period p = new Period(start,end);
        end.setYear(78);
    }
}
