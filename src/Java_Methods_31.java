public class Java_Methods_31 {
     static int logic(int x, int y) {
        int z;
        if(x>y){
            z= (x+y);
        }
        else{
            z= (x*y);
        }
        return z;
    }

//    A static method can only call a static method.
    public static void main(String[] args) {
        int a = 15;
        int b = 7;
        int c;
//        Method Invocation using object creation.
//        Java_Methods_31 obj = new Java_Methods_31();
//        c = obj.logic(a,b);
        c = logic(a,b);
        System.out.println(c);
    }
}
