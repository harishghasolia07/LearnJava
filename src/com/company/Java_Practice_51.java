// Revise this problem
package com.company;

class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[10];
        this.no_of_books = 0;
    }
    public void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+" Has been added!");
    }
    public void issueBook(String book){
        for (int i = 0; i < this.books.length; i++) {
            if(this.books[i] == book){
                System.out.println("The book <"+book+"> has been Issued!");
                this.books[i]=null;
            }
        }
        System.out.println("This Book does not exist");
    }
    public void returnBook(String book){
//        addBook(book);
//        OR
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println("Book <"+book+"> Has been returned!");
    }
    public void showAvailableBooks(){
        System.out.println("Available books are: ");
        for (String book : this.books){
            if(book == null){
//**            break; --> If we write break then if there is a book on index 2 and its value is null then it terminate the loop but if use continue then it will skip only that value.
                continue;
            }
            System.out.println("* "+book);
        }
    }
}

public class Java_Practice_51 {
    public static void main(String[] args) {
        Library lib1 = new Library();
        lib1.addBook("The Boys-1");
        lib1.addBook("The Boys-2");
        lib1.addBook("The Boys-3");
        lib1.showAvailableBooks();
        lib1.issueBook("The Boys-2");
        lib1.showAvailableBooks();
        lib1.returnBook("The Boys-2");
        lib1.showAvailableBooks();
    }
}
