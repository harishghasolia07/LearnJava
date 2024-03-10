package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Java_Gregorian_Calender_99 {
    public static void main(String[] args) {
        Calendar cl = Calendar.getInstance();
        System.out.println(cl.getTime());
        System.out.println(cl.get(Calendar.DATE));
        System.out.println(cl.get(Calendar.SECOND));
        System.out.println(cl.get(Calendar.HOUR));
        System.out.println(cl.get(Calendar.HOUR_OF_DAY) + ":" + cl.get(Calendar.MINUTE) + ":" + cl.get(Calendar.SECOND));
        GregorianCalendar gcl = new GregorianCalendar();
        System.out.println(gcl.isLeapYear(2024));
    }
}
