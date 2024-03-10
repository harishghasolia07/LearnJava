package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Java_time_api_100 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
    }
}
