package com.company;

public class Java_MethodOverloading_32 {
//When we want to return nothing then we use Void return keyword.
//static void joke() --> Its mean this method will be shared by all objects of this class(class=>Java_MethodOverloading_32)
//We can call static method by static method without creating an object.

//    static void joke(){
//        System.out.print("Hello Boy!!");
//    }
//    static void change(int x){
//        x=98;
//    }
//    static void change(int [] arr){
//        arr[0] = 90;
//    }
//  Method Overloading --->
    static void foo(){
        System.out.println("Hello Boy!!");
    }
    static void foo(int a){ //Here int a is a parameter
        System.out.println("Love you "+a+" times!!");
    }
    static void foo(int a,int b){ //Here int a is a parameter
        System.out.print("Love you "+a+" times!! and "+b+" times!!");
    }

    public static void main(String[] args) {
//        joke();
//        Case 1: Changing the integer
//        int a = 50;
//        change(a);
//        System.out.println(a);
//        Case 2: Changing the array
//        In the case of array reference will be passed to the method not whole object ke copy.
//        int [] marks = {66,88,44,77,86};
//        change(marks);
//        System.out.print(marks[0]);
        foo();
        foo(3000);//Here 3000 is a argument.Arguments are Actual.
        foo(3000,4000);

    }
}
