package com.example.library.model;

import java.util.ArrayList;
import java.util.List;

public class Reader
{
    private String id;
    private String name;
    private List<Book> borrowedBooks = new ArrayList<>();

    public Reader(String id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void borrowBook(Book book)
    {
        if (!book.isAvailable())
        {
            throw new IllegalArgumentException("Book not available");
        }

        borrowedBooks.add(book);
        book.borrow();
    }

    public void returnBook(Book book)
    {
        borrowedBooks.remove(book);
        book.returnBook();
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }

        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }

        Reader reader = (Reader) obj;

        return id.equals(reader.id);
    }

    @Override
    public int hashCode()
    {
        return id.hashCode();
    }
}