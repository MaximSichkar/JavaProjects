package com.example.library.model;

public class Book
{
    private String id;
    private String title;
    private String author;
    private boolean borrowed;

    public Book(String id, String title, String author)
    {
        this.id = id;
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }

    public String getId()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAuthor()
    {
        return author;
    }

    public boolean isAvailable()
    {
        return !borrowed;
    }

    public boolean isBorrowed()
    {
        return borrowed;
    }

    public void borrow()
    {
        borrowed = true;
    }

    public void returnBook()
    {
        borrowed = false;
    }

    @Override
    public String toString()
    {
        return id + ";" + title + ";" + author + ";" + borrowed;
    }

    public static Book fromString(String line)
    {
        String[] parts = line.split(";");

        Book book = new Book(parts[0], parts[1], parts[2]);
        book.borrowed = Boolean.parseBoolean(parts[3]);

        return book;
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

        Book book = (Book) obj;

        return id.equals(book.id);
    }

    @Override
    public int hashCode()
    {
        return id.hashCode();
    }
}