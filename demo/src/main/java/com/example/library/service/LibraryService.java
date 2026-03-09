package com.example.library.service;
import java.util.*;

import com.example.library.io.LibraryFileManager;
import com.example.library.model.Book;

public class LibraryService 
{
    private List<Book> books;
    private LibraryFileManager fileManager;

    public LibraryService() 
    {
        fileManager = new LibraryFileManager();
        books = fileManager.load();
    }

    public void addBook(String title, String author) 
    {
        books.add(new Book(title, author));
        fileManager.save(books);
    }

    public void listBooks() 
    {
        for (Book b : books) 
        {
            System.out.println(b.title + " | " + b.author + " | " + b.borrowed);
        }
    }
}
