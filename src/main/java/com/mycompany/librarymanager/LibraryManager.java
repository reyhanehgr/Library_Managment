
package com.mycompany.librarymanager;

import java.util.Scanner;

public class LibraryManager {

    public static void main(String[] args) {
        LibraryMng library = new LibraryMng();
        Scanner scanner = new Scanner(System.in);
        String Command;
        do{
            System.out.println("Commands:add , list , exit , remove:");
            Command = scanner.nextLine();
            if (Command.equals("add")){
                System.out.println("Please enter the title: ");
                String title =scanner.nextLine();
                library.addbook(title);
            }
            else if(Command.equals("list")){
                library.listbook(Command);   
            }
            else if(Command.equals("remove")){
                System.out.println("Please enter the title: ");
                String title =scanner.nextLine();
                library.removebook(Command);
            }
        }
            while(!Command.equals("exit"));
            scanner.close();
        
        
    }
}
