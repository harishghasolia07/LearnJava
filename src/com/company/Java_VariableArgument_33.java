package com.company;

/*
Arguments & Parameters-
void sum(int a , int b) --> a,b are parameters.
sum(1,2) --> 1,2 are arguments.So arguments are actual.
*/


public class Java_VariableArgument_33 {
//    static int sum(int a , int b){
//        return a+b;
//    }
    static int sum(int x,int ...arr){
//        int x is a compulsory argument
//        int ...arr is treated like int [] arr
        int result = x;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
//
        System.out.println(sum(2,3));
        System.out.println(sum(2, 3, 4));
    }
}
