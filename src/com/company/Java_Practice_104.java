package com.company;

import java.util.ArrayList;

class Book{
    public String name,author,issued_to,issued_on;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
class MyLibrary{
    public ArrayList<Book>books;
    public MyLibrary(ArrayList<Book>books){
        this.books=books;
    }
    public void addBook(Book book){
        System.out.println("Book has been added to the library");
        this.books.add(book);
    }
    public void issueBook(Book book, String issued_to){
        System.out.println("This Book has been issued.");
        this.books.remove(book);
    }
    public void returnBook(Book book){
        System.out.println("Book has been returned to the library");
        this.books.add(book);
    }


}

public class Java_Practice_104 {
    public static void main(String[] args) {
            ArrayList<Book> bk = new ArrayList<>();
            bk.add(new Book("Algo-1","DB-1"));
            bk.add(new Book("Algo-2","DB-2"));
            bk.add(new Book("Algo-3","DB-3"));
            MyLibrary lib1 = new MyLibrary(bk);
            lib1.addBook(new Book("Algotithem","myAuthor"));
            System.out.println(lib1.books);
    }
}
