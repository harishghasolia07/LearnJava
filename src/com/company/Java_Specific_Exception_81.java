package com.company;

import java.util.Scanner;

public class Java_Specific_Exception_81 {
    public static void main(String[] args) {
        int [] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index : ");
        int index = sc.nextInt();

        System.out.println("Enter the number you wanna divide by");
        int number = sc.nextInt();

        try{
            System.out.println("The value at array index entered is : "+arr[index]);
            System.out.println("The value of array-value/number is : "+arr[index]/number);
        }
        catch (ArithmeticException e){
            System.out.println("Some ArithmeticException Occured!!");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Some ArrayIndexOutOfBoundsException Occured!!");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some other exception occured!!");
            System.out.println(e);
        }

    }
}
