package com.company;

class Cylinder{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2* 3.142*radius*radius+2*3.142*radius*height;
    }

    //  By Constructor -->
    public Cylinder(int Radius,int Height){
        radius = Radius;
        height = Height;
    }
}

public class Java_Practice_44 {
    public static void main(String[] args) {
        Cylinder c2 = new Cylinder(10,30);
//        Cylinder c1 = new Cylinder();
//        c1.setRadius(10);
//        c1.setHeight(20);
        int h = c2.getHeight();
        System.out.println(h);
        System.out.println(c2.surfaceArea());
    }
}