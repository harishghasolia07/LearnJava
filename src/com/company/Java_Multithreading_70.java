package com.company;
/*
Notes:-
Multithreading :- multitasking within a process.
->It require less resources.
->It gives Lightweight independence execution.

Concurrency vs parallelism :-
Concurrency - Ek time pe ek task will be run but we are managing
              multiple computation at the same time.
Parallelism - Ek time pe multiple process will be run.

->By using multit.hreading we can achieve concurrency.
*/

class MyThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<100){
            System.out.println("My Thread1 for Cooking");
            System.out.println("My name is Khan");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<100){
            System.out.println("My Thread2 is chatting with her");
            System.out.println("I am Going Home");
            i++;
        }
    }
}

public class Java_Multithreading_70 {
    public static void main(String[] args) {
        MyThread1 mt1 = new MyThread1();
        MyThread2 mt2 = new MyThread2();
/*      mt1.run(); --> First execute method one 100 times and after that.
        mt2.run();     run second method 100 times.
                   --> You can call the run() method directly, but it will not
                       execute the code in a separate thread; instead, it will
                       run the code in the current thread.

 */
        mt1.start(); //To run a thread in Java, we need to call the start() method on the Thread object.
        mt2.start();
    }
}
