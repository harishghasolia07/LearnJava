package com.company;
/*
Interface ko extend karke class nahi bna skate,we can implement interface
into class by using keyword "implements".But we can extend interface into
another Interface by using "extend" keyword.


*/

interface SampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends SampleInterface{
    void meth3();
    void meth4();
}
class MySampleClass implements childSampleInterface{
    @Override
    public void meth1() {
        System.out.println("Meth1");
    }
    public void meth2() {
        System.out.println("Meth2");
    }
    public void meth3() {
        System.out.println("Meth3");
    }
    public void meth4() {
        System.out.println("Meth4");
    }
}


public class Java_Inheritance_in_Interfacees_58 {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
