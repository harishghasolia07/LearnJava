package com.company;

/*
Priorities-
java.lang.Thread.MIN_PRIORITY = 1
java.lang.Thread.NORM_PRIORITY = 5
java.lang.Thread.MAX_PRIORITY = 10
*/

class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while (i<100){
            System.out.println("I am a Thread "+getName());
            i++;
        }
    }
}

public class Java_Thread_Priorities_74 {
    public static void main(String[] args) {
//      Ready Queue: T1 T2 T3 T4 T5
        MyThr1 T1 = new MyThr1("Hello-1");
        MyThr1 T2 = new MyThr1("Boy-1");
        MyThr1 T3 = new MyThr1("Hello-2");
        MyThr1 T4 = new MyThr1("Boy-2");
        MyThr1 T5 = new MyThr1("Hello-3");
        T5.setPriority(Thread.MAX_PRIORITY);
        T1.setPriority(Thread.MIN_PRIORITY);
        T2.setPriority(Thread.MIN_PRIORITY);
        T1.start();
        T2.start();
        T3.start();
        T4.start();
        T5.start();
    }
}
