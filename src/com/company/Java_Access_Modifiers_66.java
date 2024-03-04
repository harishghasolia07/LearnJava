package com.company;

class Access{
    public int x = 5;
    protected int y = 10;
    int z = 15;
    private int w = 20;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);
    }
}

public class Java_Access_Modifiers_66 {
    public static void main(String[] args) {
        Access c1 = new Access();
        c1.meth1();
        System.out.println(c1.x);
        System.out.println(c1.y);
        System.out.println(c1.z);
//      System.out.println(c1.w); -->error due to private access modifier.
    }
}
