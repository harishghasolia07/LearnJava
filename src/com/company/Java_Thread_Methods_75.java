package com.company;

class MyThread3 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (true){
//            System.out.println("My Thread1 for Cooking");
            System.out.println("My name is Khan");
//            i++;
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class MyThread4 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<5){
//            System.out.println("My Thread2 is chatting with her");
            System.out.println("I am Going Home");
            i++;
        }
    }
}

public class Java_Thread_Methods_75 {
    public static void main(String[] args) {
        MyThread3 mt3 = new MyThread3();
        MyThread4 mt4 = new MyThread4();

        mt3.start();
        try {
            mt3.join(); //If we want to MT4 shouldn't begin until MT3 has fully executed.
        }
        catch (Exception e){
            System.out.println(e);
        }
        mt4.start();
    }
}
