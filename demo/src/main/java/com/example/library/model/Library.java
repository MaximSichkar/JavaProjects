package com.example.library.model;

import java.util.List;
import java.util.Optional;

public class Library 
{
    private List<Book> books;
    private List<Reader> readers;
    public void addBook(Book book)
    public void removeBook(String bookId)
    public void addReader(Reader reader)
    public void removeReader(String readerId)
    public Optional<Book> findBookById(String id)
    public Optional<Reader> findReaderById(String id)
}