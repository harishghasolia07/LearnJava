package com.company;
/* Abstract class is a class whose object can't be created because
it is not a class it is a way to create another class which actually exist.
So abstract class is a class by using them we can create another class,
so it is basically set a standard. --> 2 Methods -->
1.) Ya tho Method ko override kar do
2.) Ya phir class ko abstract bna do
*/
abstract class Parent{
    public Parent(){
        System.out.println("Constructor of Parent");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet1();

}
class Child1 extends Parent{
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }
    @Override
    public void greet1() {
        System.out.println("Good AfterNoon");
    }
}
abstract class Child2 extends Parent{
    public void any(){
        System.out.println("Anything");
    }
}

public class Java_AbstractClass_53 {
    public static void main(String[] args) {
//        Parent p1 = new Parent(); --> Error
          Child1 ch1 = new Child1();
          ch1.sayHello();
//        Child2 ch2 = new Child2(); --> Error
    }
}
