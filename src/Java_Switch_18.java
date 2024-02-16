import java.util.Scanner;
public class Java_Switch_18 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the value of a :");
        int a;
        a = sc.nextInt();
        switch (a){
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("Nothing");

        }
        //OR
//        switch (a) {
//            case 10 -> System.out.println("10");
//            case 20 -> System.out.println("20");
//            case 30 -> System.out.println("30");
//            default -> System.out.println("Nothing");
//        }
        System.out.print("thanks!!");

    }

}
