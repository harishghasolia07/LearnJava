package com.company;

import java.util.Scanner;
public class Java_functionPractice_35 {

//    Q.1 Fibonacci number
//    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
// Method to calculate the nth Fibonacci number recursively
//    static int fibonacci(int n){
//        if(n<=1){
//            return n;
//        }
//        else{
//            return fibonacci(n-1)+fibonacci(n-2);
//        }
//    }
//    public static void main(String[] args) {
//        System.out.print("Enter the Number of terms in the fibonacci series : ");
//        Scanner sc = new Scanner(System.in);
//        int NoOfTerms;
//        NoOfTerms = sc.nextInt();
//        for (int i = 0; i < NoOfTerms; i++) {
//            System.out.print(fibonacci(i)+" ");
//        }
//    }

//    ------------------------------------------------------------
//    Q.2
//    static int table(int n){
//        for (int i = 1; i < 11; i++) {
//            System.out.format("%d X %d = %d\n",n,i,n*i);
//        }
//        return 0;
//    }
//    public static void main(String[] args) {
//        System.out.print("Enter the number : ");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        table(a);
//    }

//    ---------------------------------------------------------------
//    Q.3
//    static int pattern(int n){
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        return 0;
//    }
//    public static void main(String[] args) {
//        pattern(5);
//    }

//    ----------------------------------------------------------------
//    Q.4
//    0,1,2,3,4,5,6.....

//    static int number(int n){
//        By For loop--->
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += i;
//        }
//        System.out.print(sum);
//        return 0;
//        By Recurrsive ---->
//        if(n==1){
//            return 1;
//        }
//        else{
//            return n + number(n-1);
//        }
//    }
//    public static void main(String[] args) {
//        System.out.print("Enter the number of terms : ");
//        Scanner sc = new Scanner(System.in);
//        int num;
//        num = sc.nextInt();
//        System.out.print(number(num));
//    }

//    ---------------------------------------------------------------
//    Q.5
//      static int pattern(int n){
//        for (int i = 0; i < n; i++) {
//            for (int j = n; j >i; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        return 0;
//    }
//    public static void main(String[] args) {
//        pattern(5);
//    }

//    -------------------------------------------------------------
//    Q.6
//        static int AvgSum(int ...arr){
//            int result = 0;
//            for (int i = 0; i < arr.length; i++) {
//                result += arr[i];
//            }
//            return result/arr.length;
//        }
//
//    public static void main(String[] args) {
//        System.out.print(AvgSum(1,2,3,4,5,6,7,8,9,10));
//
//    }
//
//    -------------------------------***************************---------------------------------
//    n=3
//    pattern(2)+ 3 times star
//    pattern(1)+ 2 times star + 3 times star
//    pattern(0) +1 times star + 2 times star + 3 times star
//    Q.7 By using Recursion -->
//       static void pattern(int n){
//           if (n > 0) {
//               pattern(n-1);
//               for (int i = 0; i < n; i++) {
//                   System.out.print("*");
//               }
//               System.out.println();
//           }
//
//       }
//
//    public static void main(String[] args) {
//        pattern(5);
//    }
//
//    ------------------------------------------------------------------------
//    Q.8
//    static float temp(float t){
//        System.out.print((t * 9/5) + 32 );
//        return 0;
//    }
//
//    public static void main(String[] args) {
//        temp(0);
//    }



}
