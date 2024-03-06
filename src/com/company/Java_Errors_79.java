package com.company;

import java.util.Scanner;

public class Java_Errors_79 {
    public static void main(String[] args) {

        //SYNTAX ERROR DEMO
        // int a = 0
        //    b = 10;

        // LOGICAL ERROR DEMO
        // WRITE A PROGRAM TO print all prime no 1-10
        System.out.println(2);
        for (int i = 0; i < 5; i++) {
            System.out.println(2*i+1);
        }

        // RunTime Error
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println(100/k);

    }
}
