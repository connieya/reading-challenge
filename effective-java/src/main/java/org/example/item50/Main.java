package org.example.item50;


import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date start = new Date();
        Date end = new Date();
        Period p = new Period(start,end);
        end.setYear(78);

        AuthPrc authPrc = new AuthPrc(3);
        System.out.println(authPrc.a);
        System.out.println(authPrc.b);
    }
}
