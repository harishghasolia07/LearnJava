package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Java_Practice_102 {
    public static void main(String[] args) {

//        -----------------Q.1----------------------

//        ArrayList<String> arr = new ArrayList<>();
//        arr.add("The Boys-0");
//        arr.add("The Boys-1"
//        arr.add("The Boys-2");
//        arr.add("The Boys-3");
//        for (Object e: arr){
//            System.out.println(e);
//        }


//        -------------------Q.5---------------------

//        Set<Integer> s1 = new Set<>(); -->Set is an interface. It objects
//        cannot be created.
//        HashSet<Integer> s= new HashSet<>();
//        s.add(10);
//        s.add(20);
//        s.add(30);
//        s.add(40);
//        s.add(20);
//        System.out.println(s);
//
//        --------------------Q.2---------------------

//        Date d = new Date();
//        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
//
//        Calendar cld = Calendar.getInstance();
//        System.out.println(cld.get(Calendar.HOUR_OF_DAY)+":"+ cld.get(Calendar.MINUTE)+":"+ cld.get(Calendar.SECOND));

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a"); //This is the format
        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_LOCAL_DATE;

        String myDate = ldt.format(dtf); //Creating Date string date time format

        System.out.println(myDate);


    }
}
