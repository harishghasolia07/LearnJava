import java.util.Scanner;

public class Java_ArrayPractice_29 {
    public static void main(String[] args) {
//        Q.1
//        float sum=0;
//        float [] num = {1.2f,2.3f,3,4,5};
//        for (int i = 0; i < num.length; i++) {
//            sum += num[i];
//        }
//        System.out.println(sum);
//
//        Q.2-------------****--------------
//        int a;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number : ");
//        a = sc.nextInt();
//        int [] num = {1,2,3,4,5};
//        boolean inArray = false;
//        for (int i = 0; i < num.length; i++) {
//            if(num[i]==a){
//                inArray = true;
//                break;
//            }
//        }
//        if(inArray){
//            System.out.print("Present");
//        }
//        else{
//            System.out.print("NOT Present");
//        }

//        Q.4------------------------

//        int sum=0;
//        int [][] num;
//        num = new int[2][3];
//        num[0][0] = 1;
//        num[0][1] = 2;
//        num[0][2] = 3;
//        num[1][0] = 4;
//        num[1][1] = 5;
//        num[1][2] = 6;
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j<num[i].length; j++){
//                System.out.print(num[i][j]);
//                System.out.print(" ");
//                sum += num[i][j];
//            }
//            System.out.println("");
//        }
//        System.out.println("Sum is : "+sum);
//
//        Q.5------------******-----------

//        int[] arr = {1, 2, 3, 4, 5};
//        int l = arr.length;
//        int n = Math.floorDiv(l, 2);
//        int temp;
//        for (int i = 0; i < n; i++) {
//            temp = arr[i];
//            arr[i] = arr[l - i - 1];
//            arr[l - i - 1] = temp;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        Q.6------------************-------------------
//        For MAX -->
//        int arr[]={-1,-2,-3,-10,-5,-6};
//        int max=Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//                if(arr[i]>max){
//                    max = arr[i];
//                }
//        }
//        System.out.print(max);

//        For Min -->
//        int arr[] = {9,2,3,4,5,6};
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]<min){
//                min = arr[i];
//            }
//        }
//        System.out.print(min);
//
//        Q.7-------------**********--------------------
        int arr[] = {1,2,3,5,6};
        boolean isSorted = true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
              }
          }
        if(isSorted){
            System.out.print("Array is Sorted!!");
        }
        else {
            System.out.print("Array is not sorted!!");
        }
        }
    }
