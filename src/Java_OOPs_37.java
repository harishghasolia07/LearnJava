class employee{
    int id;
    String name;
    public void printdetails(){
        System.out.println(name);
        System.out.println(id);
    }
}

public class Java_OOPs_37 {
    public static void main(String[] args) {
        employee boy = new employee();
        employee boy1 = new employee();
        boy.name = "Harish";
        boy.id = 7;
        boy1.name = "Harry";
        boy1.id = 4;
        boy.printdetails();
        boy1.printdetails();
    }
}