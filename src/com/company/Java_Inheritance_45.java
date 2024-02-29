package com.company;

class Base{
    public int x;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am a constructor");
    }
}
class Derived extends Base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Java_Inheritance_45 {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());
        Derived c = new Derived();
        c.setX(5);
        System.out.println(c.getX());
//        Base b = new Base();
//        b.setY(4);   ---> We cannot access the variables of Derived class into Base class but visa versa its true.
//        System.out.println(b.getY());

    }
}
