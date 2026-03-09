package com.example.library;

import java.util.Scanner;

import com.example.library.service.LibraryService;

public class Main {

    public static void main(String[] args) {

        LibraryService service = new LibraryService();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n=== LIBRARY MENU ===");
            System.out.println("1 Add book");
            System.out.println("2 List books");
            System.out.println("3 Add reader");
            System.out.println("4 Borrow book");
            System.out.println("5 Return book");
            System.out.println("6 Exit");

            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Author: ");
                    String author = scanner.nextLine();

                    service.addBook(title, author);
                    break;

                case 2:
                    service.listBooks();
                    break;

                case 3:
                    System.out.print("Reader id: ");
                    String readerId = scanner.nextLine();

                    System.out.print("Reader name: ");
                    String name = scanner.nextLine();

                    service.addReader(readerId, name);
                    break;

                case 4:
                    System.out.print("Reader id: ");
                    readerId = scanner.nextLine();

                    System.out.print("Book id: ");
                    String bookId = scanner.nextLine();

                    service.borrowBook(readerId, bookId);
                    break;

                case 5:
                    System.out.print("Reader id: ");
                    readerId = scanner.nextLine();

                    System.out.print("Book id: ");
                    bookId = scanner.nextLine();

                    service.returnBook(readerId, bookId);
                    break;

                case 6:
                    System.out.println("Bye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
