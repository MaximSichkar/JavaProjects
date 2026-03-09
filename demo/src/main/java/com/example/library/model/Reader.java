package com.example.library.model;

import java.util.List;

public class Reader 
{
    private String id;
    private String name;
    private List<Book> borrowedBooks;
    public void borrowBook(Book book) {
        if (!book.isAvailable()) {
            throw new IllegalArgumentException("Book not available");
        }
        borrowedBooks.add(book);
        book.borrow();
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.returnBook();
    }
}