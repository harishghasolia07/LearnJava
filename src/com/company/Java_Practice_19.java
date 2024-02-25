package com.company;

import javax.swing.*;
import java.util.Scanner;
public class Java_Practice_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int marks_sub_1,marks_sub_2,marks_sub_3,total_marks;
//        double overall_percentage;
//        System.out.println("Enter subject 1 marks : ");
//        marks_sub_1 = sc.nextInt();
//        System.out.println("Enter subject 2 marks : ");
//        marks_sub_2 = sc.nextInt();
//        System.out.println("Enter subject 3 marks : ");
//        marks_sub_3 = sc.nextInt();
//        total_marks = marks_sub_1+marks_sub_2+marks_sub_3;
//        System.out.println("Total Marks is : " + total_marks);
//        overall_percentage = ((double)total_marks / 300) * 100;
//        System.out.println("Total Percentage is : "+overall_percentage+"%");
//        if(overall_percentage<40 && marks_sub_1<33 && marks_sub_2<33 && marks_sub_3<33){
//            System.out.print("Failed!");
//        }
//        else{
//            System.out.print("Your overall percentage is "+overall_percentage+"% and you are passed!");
//        }
        int day;
        System.out.println("Enter the day :");
        day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
        }



    }
}
