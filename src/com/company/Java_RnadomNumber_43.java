package com.company;
import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int input_number;
    public int noOfGuesses=0;

    public int getNoOfGuesses(){
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }
    public Game(){ //Constructor has no return type.
        Random rn = new Random();
        number = rn.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the Number : ");
        Scanner sc = new Scanner(System.in);
        input_number = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(input_number == number){
            System.out.format("Right Guess and the number is %d\n" +
                    "And you guessed in %d attempts",number,noOfGuesses);
            return true;
        } else if (input_number<number) {
            System.out.println("Too Low...");
        } else if (input_number>number) {
            System.out.println("Too High...");
        }
        return false;
    }
}

public class Java_RnadomNumber_43 {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b =false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
//            System.out.println(b);
        }
    }
}
