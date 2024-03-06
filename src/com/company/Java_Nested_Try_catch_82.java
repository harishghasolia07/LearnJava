package com.company;

import java.util.Scanner;

public class Java_Nested_Try_catch_82 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("Enter the array index : ");
            int index = sc.nextInt();
            try {
                System.out.println("Welcome!");
                try {
                    System.out.println(arr[index]);
                    flag = false;
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("This index no is not exist");
                    System.out.println("Exception at level 2");
                }
            }
            catch (Exception e) {
                System.out.println("Exception at level 1");
            }
        }
        System.out.println("Thanks for using this program!!");
    }
}
