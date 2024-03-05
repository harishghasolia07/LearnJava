package com.company;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while (i<100){
            System.out.println("I am a Thread");
            i++;
        }
    }
}

public class Java_Constructor_of_Thread_73 {
    public static void main(String[] args) {
        MyThr mt = new MyThr("Hello");
        MyThr mt1 = new MyThr("Boy");
        mt.start();
        System.out.println(mt.getId());
        System.out.println(mt.getName());
        mt1.start();
        System.out.println(mt1.getId());
        System.out.println(mt1.getName());
    }
}
