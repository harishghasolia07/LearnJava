package com.company;

public class Java_For_Each_Loop_27 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};

//      By using For loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
//      By using For Each loop
//      Note: In For Each loop value of i is not available.If we require value of i then use above For loop
        for (int element :arr){
            System.out.println(element);
        }
    }
}
