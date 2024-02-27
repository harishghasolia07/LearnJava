package com.company;

//Q.1
/*
//  We shouldn't create two same classes into the same package.
    class Employee{
//  Create Properties
    int salary;
    String name;
//  Create Method
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public void setName(String n) {
        name = n;
    }
}

    public class Java_OOPs_Practice_39 {
        public static void main(String[] args) {
            Employee boy = new Employee();
            boy.setName("Homelander");
            boy.salary = 0;
            System.out.println(boy.getName());
            System.out.println(boy.getSalary());
    }
}



-----------------------------------------
Q.2

*/
/*
    class cellphone {
        public void ringing() {
            System.out.println("Ringing");
        }

        public void vibrate() {
            System.out.println("Vibrating");
        }
    }
    public class Java_OOPs_Practice_39 {
    public static void main(String[] args) {
    cellphone Nokia = new cellphone();
        Nokia.ringing();
        Nokia.vibrate();
    }
}
--------------------------------------
Q.3
*/
class Square{
    int length;
    public int getarea(){
        return length*length;
    }
    public int getperemeter(){
      return 4*length;
    }
}
public class Java_OOPs_Practice_39 {
    public static void main(String[] args) {
    Square sq1 = new Square();
    sq1.length = 20;
        System.out.println(sq1.getarea());
        System.out.println( sq1.getperemeter());
    }
}

