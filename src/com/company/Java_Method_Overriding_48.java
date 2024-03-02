package com.company;

class ClassA{
    public int a;
    public int meth1(){
        return 1;
    }
    public void meth2(){
        System.out.println("Method 2 of class A");
    }
}
class ClassB extends ClassA{
    @Override //It is useful to prevent from accidental change in the base class method.If there is no overridding then it will produce an error.
    public void meth2(){ // Meth2 is present in both classes but the main diff in the output statement.Which is called overriding.
        System.out.println("Method 2 of class B");
    }
    public void meth3(){
        System.out.println("Method 3 of class B");
    }
}

public class Java_Method_Overriding_48 {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.meth2();
        ClassB b = new ClassB();
        b.meth2();
    }
}

/*
NOTE:Method overrinding is different from method overloading.
Method Overloading -> There are two method in same class with same name but with diff parameters.
 */
