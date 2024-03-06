package com.company;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return "I'm toString()";
    }
//    public String toString(){
//        return super.toString()+" I'm toString()";
//    }
    @Override
    public String getMessage(){
        return "I'm getString()";
    }
}
class AgeException extends Exception{
    @Override
    public String toString(){
        return "Age cannot be greater than 125";
    }
    @Override
    public String getMessage(){
        return "Make sure that the value of age entered is correct";
    }
}

public class Java_Exception_Class_83{
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        age=sc.nextInt();
        if(age>125){
            try {
//                throw new MyException();
                throw new AgeException();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished!");
            }
        }
        System.out.println("You'll be die soon!!");
    }
}

/*
Note:-
Thrown Exception: The throw statement is used to throw a specific exception.
In this case, there are two types of exceptions that could potentially be
thrown: MyException and AgeException. However, it seems that only AgeException
is being thrown based on the commented-out code.

catch Block: Immediately following the try block, there is a catch block.
This block is responsible for catching and handling exceptions that are
thrown within the associated try block. It catches exceptions of type
Exception or any of its subclasses.
*/
