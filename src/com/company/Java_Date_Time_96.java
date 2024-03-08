package com.company;

import java.util.Date;


public class Java_Date_Time_96 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis()/1000/3600/24/365;
        System.out.println(Long.MAX_VALUE);
        System.out.println(time);
        Date d = new Date();
        System.out.println(d.getDate());
        System.out.println(d.getYear());
    }
}
