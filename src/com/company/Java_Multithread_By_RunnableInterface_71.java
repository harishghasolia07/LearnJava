package com.company;

//implement method in runnable
class MyThreadRunnable1 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("I am thread 1 not a threat 1");
            i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("I am thread 2 not a threat 2");
            i++;
        }
    }
}

public class Java_Multithread_By_RunnableInterface_71 {
    public static void main(String[] args) {
 /*        MyThreadRunnable1 t1 = new MyThreadRunnable1();
           MyThreadRunnable1 t2 = new MyThreadRunnable1();

          t1.start(); --> Whenever we implement runnable interface we cannot be able to run start() method directly on it.
                          When you implement the Runnable interface in Java, you need to create a Thread object and pass your
                          Runnable instance to it. Then, you call the start() method on the Thread object to start the execution of the
                          Runnable code in a new thread.
          t2.start();

*/
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
