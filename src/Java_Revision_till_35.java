package com.company;

import java.util.Scanner;
//
//public class Java_Revision_till_35 {
//    public static void main(String[] args) {
//        int number;
//        Scanner sc = new Scanner(System.in);
//        number = sc.nextInt();
//        switch (number){
//            case 1:
//                System.out.print("M");
//                break;
//            case 2:
//                System.out.print("T");
//                break;
//            case 3:
//                System.out.print("W");
//        }
//        -----------
//        int n=5;
//        for (int i = n; i >0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//        ------------
//        int n = 6;
//        int sum=0;
//        for (int i = 0; i <= n; i++) {
//            if (i % 2 == 0) {
//                sum += i;
//            }
//        }
//        System.out.print(sum);

//        -----------------
//        int n = 8;
//        int sum = 0;
//        for (int i = 10; i > 0; i--) {
//            sum += n * i;
//            System.out.printf("%d X %d = %d\n", n, i, n * i);
//        }
//        System.out.println(sum);
//        --------------
//        5!=5x4x3x2x1
//        int n=5;
//        int mult = 1;
//        for (int i = 1; i <= n ; i++) {
//            mult *= i;
//        }
//        System.out.print(mult);
//    }
//        -----------
//        float sum = 0;
//        float [] arr = {1f,0.2f};
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        System.out.print(sum);
//        int num ;
//        Scanner sc1 = new Scanner(System.in);
//        System.out.print("Enter a number : ");
//        num = sc1.nextInt();
//        int [] arr ={0,1,2,3,4,5};
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]==num){
//                System.out.println("Number "+arr[i]+" is present in array");
//                break;
//            }
//        }
//OR
//        int a;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number : ");
//        a = sc.nextInt();
//        int [] num1 = {1,2,3,4,5};
//        boolean inArray = false;
//        for (int i = 0; i < num1.length; i++) {
//            if(num1[i]==a){
//                inArray = true;
//                break;
//            }
//        }
//        if(inArray){
//            System.out.print("Present");
//        }
//        else{
//            System.out.print("NOT Present");
//        }
//      -------------************************------------

//        int [][] mat1 = {{1, 2, 3},
//                         {4, 1, 1}};
//        int [][] mat2 = {{1, 2, 3},
//                         {4, 5, 6}};
//        int [][] sum = {{0, 0, 0},
//                        {0, 0, 0}};
//        for (int i = 0; i < mat1.length; i++) {
//            for (int j = 0; j < mat1[i].length; j++) {
//                sum[i][j] = mat1[i][j]+mat2[i][j];
//                System.out.print(sum[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//        ----------*******************----------

//        int [] arr = {1,2,3,4,5};
//        int l = arr.length;
//        int n = Math.floorDiv(l,2);
//        int temp;
//        for (int i = 0; i < n; i++) {
//            temp = arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-1-i] = temp;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//
//        ------------------------------------
//        int [] arr = {1,2,10,4,5};
//        int max= 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.print(max);
//
//        ------------------*******************Done---------------------

//        int [] arr={2,5,9,10,11};
//        boolean issorted = true;
//        for (int i = 0; i < arr.length-1; i++) {
//            if(arr[i]>arr[i+1]){
//                issorted = false;
//                break;
//            }
//        }
//        if (issorted){
//            System.out.print("Sorted!!");
//        }
//        else{
//            System.out.print("Not Sorted!!");
//        }

//    }
//            }

//        vid-35--->
//        -----------------------------------
          public class Java_Revision_till_35 {
//              static int pattern(int n){
//                  for (int i = 0; i < n; i++) {
//                      for (int j = n; j > i; j--) {
//                          System.out.print("*");
//                      }
//                      System.out.println();
//                  }
//                  return 0;
//              }
//
//    public static void main(String[] args) {
//        pattern(5);
//    }

//    ------------------------------------------
//    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,
//    static int fib(int n){
//        if(n<=1){
//            return n;
//        }
//        else{
//            return fib(n-1)+fib(n-2);
//        }
//    }
//
//    public static void main(String[] args) {
//        int NoofTerms =10;
//        for (int i = 0; i < NoofTerms; i++) {
//            System.out.print(fib(i)+" ");;
//        }
//    }

//    n=3
//    pattern(2)+ 3 times star
//    pattern(1)+ 3 times star + 3 times star
//    pattern(0) +1 times star + 2 times star + 3 times star




    static void pattern(int n){
        if(n>0){
            pattern(n-1);
            for (int i = 0; i <n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }

}


