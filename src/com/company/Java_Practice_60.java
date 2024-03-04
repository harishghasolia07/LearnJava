package com.company;

/* Q.1&2
abstract class Pen{
    abstract public void write();
    abstract public void refill();
}
class FountaionPen extends Pen{
    @Override
    public void write(){
        System.out.println("Writting...");
    }
    @Override
    public void refill(){
        System.out.println("Refilling...");
    }
    public void changeNib(){
        System.out.println("Changing Nib...");
    }
}
public class Java_Practice_60 {
    public static void main(String[] args) {
        FountaionPen f1 = new FountaionPen();
        f1.write();
        f1.refill();
        f1.changeNib();
    }
}
-------------------------------------------------
*/
class Monkey{
    public void jump(){
        System.out.println("Jumping");
    }
    public void bite(){
        System.out.println("Bite");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    public void speak(){
        System.out.println("Speaking");
    }
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
}

public class Java_Practice_60 {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.jump();
        h1.sleep();
        //Q.5
        Monkey m1 = new Human(); //Monkey as a reference and New object is created of Human.
        m1.jump();
        m1.bite();
//      m1.speak(); -->Cannot use speak method because the reference is monkey which does not have speak method.
        BasicAnimal ba = new Human();
        ba.eat();
        ba.sleep();
//      ba.speek();  -->error
    }
}