import java.util.Random;
import java.util.Scanner;
public class Java_Rock_paper_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter your Number between 0 to 2: ");
        int a;
        a = sc.nextInt();
        int b = random.nextInt(3);
        System.out.println("Computer's Number is : "+b);
        if(a==0 && b==0){
            System.out.println("Draw!!");
        }
        else if(a==0 && b==1){
            System.out.println("computer win!!");
        }
        else if(a==0 && b==2){
            System.out.println("You win!!");
        }
        else if(a==1 && b==0){
            System.out.println("You win!!");
        }
        else if(a==1 && b==1){
            System.out.println("Draw!!");
        }
        else if(a==1 && b==2){
            System.out.println("computer win!!");
        }
        else if(a==2 && b==0){
            System.out.println("computer win!!");
        }
        else if(a==2 && b==1){
            System.out.println("You win!!");
        }
        else if(a==2 && b==2){
            System.out.print("Draw!!");
        }
        else{
            System.out.println("Invalid Input!!");
        }
//        0 for rock
//        1 for paper
//        2 for scissor
//        00 01 02 10 11 12 20 21 22
    }
}
