public class Java_Recursion_34 {
    static int factorial(int n){ //Method Creation
//        factorial(n)=n*n-1*n-2....1
//        factorial(n)=n*factorial(n-1)
//        5 = 5x4x3x2x1
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
//    OR By Itrative Appoach -->
    static int factorial_Itrative(int n){
        if(n==0 || n==1){
            return 1;
       }
        else{
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        int a=5;
        System.out.println(factorial(a));
        System.out.println(factorial_Itrative(5));
    }
}
