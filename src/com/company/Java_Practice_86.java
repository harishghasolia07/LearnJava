package com.company;

import java.util.Scanner;

class ArrayIndexException extends Exception{
    @Override
    public String toString(){
        return "Index is out of Array ";
    }
}

public class Java_Practice_86 {
    public static void main(String[] args) {
        //Q.2
/*        int a = 50;
          int b = 0;
          int result = a/b;

       -->The exception will not be caught by the try-catch
          block because the exception occurs at the line where
          the result variable is being assigned, not within the
          try block.
//        try {
//            System.out.println(result);
        }


        try {
            int result = a/b;
            System.out.println(result);
        }
        catch (ArithmeticException e){
            System.out.println("Hehehe");
        }
        catch (IllegalArgumentException e){
            System.out.println("Hahaha");
        }
*/

//---------Q.3&4-----------------

        int [] arr = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        int index;
        boolean flag = true;
        int count = 1;

        while (flag && count<6){
            try{
                System.out.println("Enter the value of Index "+count+"th time");
                index = sc.nextInt();
                System.out.println("The value of Array at index is: "+arr[index]);
                break;
            }
            catch (Exception e){
                System.out.println("Invalid Index ");
            }
            count++;

            if(count>=6){
                try {
                    throw new ArrayIndexException();
                }
                catch (Exception e){
                    System.out.println(e.toString());
                }
            }

        }


    }
}
