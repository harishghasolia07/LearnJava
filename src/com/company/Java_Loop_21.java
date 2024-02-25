package com.company;

public class Java_Loop_21 {
    public static void main(String[] args) {
//        int i=1;
//        while(i<10){
//            System.out.println("Hello");
//            i=i+2;
//        }
//        do{
//            System.out.println(i);
//            i++;
//        }while (i<6);
        for (int i=5;i>0;i--){
            if(i==2){
                System.out.println("You'r Great!!");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is Great!!z");
        }
    }
}
