package com.company;

class Employee{
    private int id; // We can access them by the using methods.We are using because by them
    // we can apply some condition on the taking input.
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String n){
        name = n; //assigning the value of the parameter n to the name variable.
        //n = name; //assigning the value of the name variable to the parameter n.
    }

    public void setId(int i){
        id = i;
    }
    public int getId(){
         return id;
    }
}

public class Java_modifiers_40 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Harry");
        e1.setId(10);
        System.out.println(e1.getName());
        System.out.println(e1.getId());
    }
}
