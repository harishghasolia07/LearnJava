package com.company;

public class Java_String_14 {
    public static void main(String[] args){
        String name = "Harish";
        int length = name.length();
        String lString = name.toLowerCase();
        System.out.println(lString);
        String nonTrimmedString = "   Harish   ";
        String Trimming = nonTrimmedString.trim();
        System.out.println(Trimming);
        System.out.println(name.substring(2));
        System.out.println(name.substring(2,4));
        System.out.println(name.replace('r','i'));
        System.out.println(name.replace("ri", "ll"));
        System.out.println(name.startsWith("Hari"));

    }
}
