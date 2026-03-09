package com.example.library.model;
public class Book 
{
    String title;
    String author;
    boolean borrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }

    @Override
    public String toString() {
        return title + ";" + author + ";" + borrowed;
    }

    public static Book fromString(String line) {
        String[] parts = line.split(";");
        Book book = new Book(parts[0], parts[1]);
        book.borrowed = Boolean.parseBoolean(parts[2]);
        return book;
    }
}
