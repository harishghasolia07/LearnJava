package com.company;

public class Java_Throw_Throws_84 {

    public static int divide(int a,int b) throws ArithmeticException{
        //Made by user 1
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        //Made by user 2
        try {
            int c = divide(50,0);
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("Invalid value of b entered!");
        }
    }
}

/*
So basically we use <throw> keyword for throw an exception Whether
it be custom or built-in-exception.
And <throws> means an alert for other programmer whose use our function
that our function may be produce an error.
*/
