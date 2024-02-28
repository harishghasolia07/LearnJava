package com.company;

class MyMainEmployee{
        private int id;
        private String name;

        public String getName(){
            return name;
        }
        public void setName(String n){
            name = n;
        }
        public void setId(int i){
        id = i;
        }
        public int getId(){
        return id;
        }
//        By using Constructor -->
         public MyMainEmployee(){ //Method Name == object class name. It will
            // run automatically without invoking it by using getter or setter.
            id = 20;
            name = "Harry";
         }
         public MyMainEmployee(String NAME,int ID){
            name = NAME;
            id = ID;
         }
         public MyMainEmployee(String NAME){
         name = NAME;
         }
         public MyMainEmployee(int ID){
         id = ID;
         }

}

public class Java_Constructors_42 {
    public static void main(String[] args) {
//        MyMainEmployee harry = new MyMainEmployee("harry");
          MyMainEmployee harry = new MyMainEmployee(50);
//        MyMainEmployee harry = new MyMainEmployee();
//        harry.setName("Hello");
//        harry.setId(10);
        System.out.println(harry.getName());
        System.out.println(harry.getId());
    }
}