package com.company;

//Create Interface
interface MyCamera{
    void takeSnap();
    void recordVideo();
/*    private void greet(){ -->Not Allowed
      System.out.println("Good Morning");}
      void record4kVideo(); -->Produce error means we can't update an interface.
      For prevent this "Default" introduce-->
*/
    default void record4kVideo(){
        System.out.println("Recording in 4k");
    }
}
//Create Interface
interface MyWifi{
    String [] getNetwork();
    void connectToNetwork(String network);
}
//Create Base class
class MycellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling"+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
//Create Child class by extending base class and implementing interfaces
class MySmartPhone extends MycellPhone implements MyCamera,MyWifi{
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
}

public class Java_Interfaces_Example_57 {
    public static void main(String[] args) {
        MySmartPhone msp = new MySmartPhone();
        msp.record4kVideo();
        String[] ar = msp.getNetwork();
        for (String name:ar){
            System.out.println(name);
        }
    }
}

/*-----------------------------------------------------------------------------------
Notes:-
A static method is not associated with an object. It is associated with a class or interface.

->class
->Abstract classes
->Interfaces
->Default Method

*/
