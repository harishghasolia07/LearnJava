package com.company;

public class Java_Finally_Block_85 {
//    public static int calc(){
//        try {
//            int a=50;
//            int b=10;
//            int c=a/b;
//            return c;
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//        finally {
//            System.out.println("End of the program!");
//        }
////        System.out.println("End of the program!"); -->Without finally block program will return from the return statement in try block.So it will never executed.
//        return -1;
//    }
    public static void main(String[] args) {
//        int k = calc();
//        System.out.println(k);
        int a = 10;
        int b = 5;
        while (true){
            try{
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am finally for the vaule of b = "+b); //Even if the loop is broken but the finally block will be executed.
            }
            b--;
        }

        //Catch block is not necessary with the try block, but there will be error produce if we not use-->
//        try {
//            System.out.println(5/0);
//        } finally {
//            System.out.println("End of the program!!");
//        }
    }
}
