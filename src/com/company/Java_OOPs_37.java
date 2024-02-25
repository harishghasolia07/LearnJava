package com.company;

class employee{
    int id;
    String name;
    int salary;
    public void printdetails(){
        System.out.println(name);
        System.out.println(id);
    }
    public int getsalary(){
        return salary;
    }

}

public class Java_OOPs_37 {
    public static void main(String[] args) {
        employee boy = new employee();
        employee boy1 = new employee();
        boy.name = "Harish";
        boy.id = 7;
        boy.salary = 1000;
        boy1.name = "Harry";
        boy1.id = 4;
        boy1.salary = 1000;
        boy.printdetails();
        boy1.printdetails();
        int salary = boy.getsalary();
        System.out.println(salary);
    }
}