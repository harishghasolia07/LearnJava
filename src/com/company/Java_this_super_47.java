package com.company;

class Ekclass{
    int a;

    public int getA() {
        return a;
    }
    Ekclass(int a){
//        a = a;  -->If we write only a=a then return a will give output 0.So basically "this" is a refrence.
        this.a = a;
        System.out.println("I am a constructor");
    }
}
class Second extends Ekclass{
    Second(int c){
        super(c);  // If we not use keyword "super" then it will automatically call default constructor
                  //Default Constructor --> Constructor without parameters
        System.out.println("I am a constructor!!");
    }
}

public class Java_this_super_47 {
    public static void main(String[] args) {
        Ekclass e1 = new Ekclass(10);
        System.out.println(e1.getA());
        Second s1 = new Second(30);
    }
}
