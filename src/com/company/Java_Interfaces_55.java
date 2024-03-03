package com.company;
/*
*Important Points*
->Abstract class can have abstract & non-abstract both methods(At least one abstract method)
->In interface all methods are abstract.
->Interface-A group of releted methods with empty bodies.
->Interface ka object ban sakta hai --> Nahi
->Interface ka reference ban sakta hai --> Haa
->Inheritance --> Extends
->Interface --> Implement
Note:Use of interfaces over abstract class is-->
If we want to create more than one class or we can say more than one template then we use Interfaces.
Class ke case me only one time extend kar sakte hai.
*/

interface Bicycle{
    int a = 45;  //Its value cannot be change in the main method.This is the final value.
    void applyBreak(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    void blowhorn1();
    void blowhorn2();
}
class AvonCycle implements Bicycle,HornBicycle{
    void blowHorn(){
        System.out.println("Horn!!");
    }
    @Override
    public void applyBreak(int decrement) { //NOTE: Interfaces methods should be public.
        System.out.println("Applying Break!");
    }
    @Override
    public void speedUp(int increment) { //NOTE: Interfaces methods should be public.
        System.out.println("Increase Speed!");
    }
    public void blowhorn1(){
        System.out.println("bye bye!");
    }
    public void blowhorn2(){
        System.out.println("Bye");
    }

}

public class Java_Interfaces_55 {
    public static void main(String[] args) {
        AvonCycle c1 = new AvonCycle();
        c1.applyBreak(10);
        // You v=can create properties in Interfaces.
        System.out.println(c1.a);
        // You cannot modify the props  in interfaces as they are final
        // c1.a=50; -->Error
    }
}
