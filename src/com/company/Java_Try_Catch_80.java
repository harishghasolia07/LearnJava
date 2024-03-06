package com.company;

public class Java_Try_Catch_80 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
//        Without Try
//        int c = a/b;
//        System.out.println(c);
//        With Try
        try {
            int c = a/b;
            System.out.println(c);
        }
        catch (Exception e){ //Exception is a object, it is a class and here "e" is the object name.
            System.out.println("Reason of failure is : ");
            System.out.println(e);
        }
        System.out.println("End of the program!!");
    }
}
