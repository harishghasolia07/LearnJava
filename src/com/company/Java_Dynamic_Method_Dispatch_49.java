package com.company;

class Phone{
    public void showTime(){
        System.out.println("Time is 6 am");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing Music...");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}

public class Java_Dynamic_Method_Dispatch_49 {
    public static void main(String[] args) {
//        Phone obj = new Phone();
//        obj.showTime();
//        SmartPhone smobj = new SmartPhone();
//        smobj.on();
//        SmartPhone obj2 = new Phone(); // Not Allowed
        Phone obj = new SmartPhone(); /* Allowed --> Reference Phone ka hai but
         actual object SmartPhone ka create ho rha hai.Tho method bhe
         SmartPhone ka run hoga na ke Phone ka which is called dynamic method
         dispatch and is used for run time polymorphism.Esme object creation
         run time pe hota hai.
         Super class ka Reference = subclass ka object*/

//        obj.music(); // Not allowed
        obj.showTime();
        obj.on();

    }
}
