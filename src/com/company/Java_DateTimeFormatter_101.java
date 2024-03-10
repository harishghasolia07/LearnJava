//Docs :- https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/format/DateTimeFormatter.html
package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Java_DateTimeFormatter_101 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now(); //This is the date
        System.out.println(ldt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a"); //This is the format
        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_LOCAL_DATE;

        String myDate = ldt.format(dtf); //Creating Date string date time format

        System.out.println(myDate);
    }
}
