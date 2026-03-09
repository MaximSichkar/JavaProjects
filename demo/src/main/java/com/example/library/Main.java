package com.example.library;

import com.example.library.service.LibraryService;

public class Main 
{
    public static void main(String[] args) {
        LibraryService service = new LibraryService();

        service.addBook("1984", "Orwell");
        service.listBooks();
}
