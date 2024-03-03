package com.company;

class Circle{
    public int radius;

    //Default Constructor-->
    Circle(){
        System.out.println("Hello");
    }
    //Constructor with parameter-->
    Circle(int r){
        System.out.println("Circle constructor with parameters");
        this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println("Cylinder constructor with parameters");
        this.height=h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

public class Java_Practice_52 {
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        c1.area();
        System.out.println(c1.area());
        Cylinder1 c2 = new Cylinder1(20,10);
        c2.volume();
        System.out.println(c2.volume());
    }
}
