
package com.mycompany.librarymanager;

import java.util.ArrayList;

public class LibraryMng {
    Book newbook = new Book();
    //private ArrayList<Book> books;
    ArrayList<Book> books = new ArrayList<>();
    public LibraryMng(){
        books = new ArrayList<>();
    }
    public void addbook(String title){
        books.add(newbook);
        System.out.println("Book" +" "+ title +" "+"has been added to the list.");
    }
    public void removebook(String title){
        for (var i =0;i< books.size();i++){
            if (title != null && title.equals(books.get(i).title)){
                books.remove(i);
                System.out.println("Book"+ " "+ title+ "haas been deleted from the list.");
                return;
            }
        }
    }
    public void listbook(String title){
        System.out.println("List of available books:");
        for (Book book:books){
            System.out.println("- " + title);
        }
    }
    
    
}
