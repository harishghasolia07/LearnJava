package com.company;

import java.util.Scanner;
public class Java_basic_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first subject marks : ");
        int sub1 = sc.nextInt();
        System.out.println("Enter the second subject marks : ");
        int sub2 = sc.nextInt();
        System.out.println("Enter the third subject marks : ");
        int sub3 = sc.nextInt();
        int total_marks = sub1+sub2+sub3;
        float percentage = (total_marks/300f)*100;
        System.out.println(percentage);
//        Q2-------------
//        System.out.print("Enter your name : ");
//        String name = sc.next();
//        System.out.print("Good Evening "+name+"!!");
//        Q3-------------
//        System.out.print("Enter the distance in the km : ");
//        double dist_in_kms = sc.nextFloat();
//        double dist_in_miles = (dist_in_kms)*0.62137;
//        System.out.print("Distance in miles is : "+dist_in_miles);
//        Q4-------------
//        System.out.print("Enter the number : ");
//        System.out.print(sc.hasNextInt());

    }
}
