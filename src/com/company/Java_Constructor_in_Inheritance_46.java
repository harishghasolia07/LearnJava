package com.company;

class Base1{
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int a){
        System.out.println("I am a overloded constructor with value a : "+a);
    }
}
class Derived1 extends Base1{
    Derived1(){
        super(10); //If we want to call argumented constructor of our base class then use <super> keyword.
        System.out.println("I am a Derived class constructor");
    }
    Derived1(int x, int y){
        super(10); //If we want to call argumented constructor of our base class then use <super> keyword.
        System.out.println("I am a overloded Derived class constructor with value : "+ x +" & " + y);
    }
}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of Derived class constructor");
    }
    ChildOfDerived(int x,int y,int z){
        super(6,7);
        System.out.println("I am a overloded child of Derived class constructor with value : "+x +" & " + y+" & " + z);
    }

}

public class Java_Constructor_in_Inheritance_46 {
    public static void main(String[] args) {
//        Base1 b = new Base1(); --> It will only call the base class constructor.
//        Derived1 d = new Derived1(); --> Firstly it will call the base class constructor and then call the derived class constructor.
//        Derived1 d = new Derived1(5,10);
        ChildOfDerived ch = new ChildOfDerived(1,2,3);
    }
}
