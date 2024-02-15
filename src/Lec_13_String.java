import java.util.Scanner;
public class Lec_13_String {
    public static void main(String[] args){
//        String name = new String("Harish");
//        System.out.print(name);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Your Name1 : ");
        String name1 = sc.nextLine();
        System.out.println("Hey "+name+"!");
        System.out.print("Hey "+name1+"!");
    }
}
