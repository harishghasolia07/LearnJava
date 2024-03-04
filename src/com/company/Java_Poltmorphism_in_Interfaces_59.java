package com.company;

//Create Interface
interface MyCamera2{
    void takeSnap();
    void recordVideo();
    default void record4kVideo(){
        System.out.println("Recording in 4k");
    }
}
//Create Interface
interface MyWifi2{
    String [] getNetwork();
    void connectToNetwork(String network);
}
//Create Base class
class MycellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling"+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
//Create Child class by extending base class and implementing interfaces
class MySmartPhone2 extends MycellPhone2 implements MyCamera2,MyWifi2{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void recordVideo(){
        System.out.println("Make Video");
    }
//    We can override this method then this one will work not above -->
//    public void record4kVideo(){
//        System.out.println("Recording in 4k...");
//    }
    public String [] getNetwork(){
        System.out.println("Getting Network..");
        String[] networklist = {"Boys1","Boys2","Boys3"};
        return networklist;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }
    public void smartphonekamethod(){
        System.out.println("SmartPhone ka method");
    }
}

public class Java_Poltmorphism_in_Interfaces_59 {
    public static void main(String[] args) {
        MyCamera2 cm2 = new MySmartPhone2(); // This is a smartphone but, use it as a camera.Here we can use only MyCamera2 methods.
/*      Here MyCmaera2 used as a reference and new object is created of MySmartPhone2
        So ham jiska reference le rhe hai usi ke methods use le skate hai which is called polymorphism.
        cm2.getNetwork(); --> Not Allowed
        cm2.smartphonekamethod(); --.Not Allowed
*/
        cm2.record4kVideo();
        MySmartPhone2 sm2 = new MySmartPhone2(); //-->Here we can use all smart phone methods.
        sm2.connectToNetwork("Hello");
        sm2.getNetwork();
        sm2.recordVideo();
        sm2.smartphonekamethod();
    }
}
