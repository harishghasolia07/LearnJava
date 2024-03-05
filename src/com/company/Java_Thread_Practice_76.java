package com.company;

class Morning extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<10){
            System.out.println("Good Morning!!");
            i++;
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class Welcome extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<10){
            System.out.println("Your Welcome!!");
            i++;
        }
    }
}
public class Java_Thread_Practice_76 {
    public static void main(String[] args) {
        Morning m1 = new Morning();
        Welcome w1 = new Welcome();

        m1.setPriority(5);
        w1.setPriority(10);

        System.out.println(m1.getPriority());
        System.out.println(w1.getPriority());

        m1.start();

        System.out.println(m1.getState());
        System.out.println(w1.getState());

        w1.start();

        System.out.println(Thread.currentThread().getState());


    }
}
