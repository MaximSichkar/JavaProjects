package com.example.Library;

import com.example.library.model.Book;
import com.example.library.model.Library;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest
{

    @Test
    public void testAddBook()
    {
        Library library = new Library();
        Book book = new Book("1", "1984", "Orwell");

        library.addBook(book);

        assertEquals(1, library.getBooks().size());
    }

    @Test
    public void testFindBook()
    {
        Library library = new Library();
        Book book = new Book("1", "1984", "Orwell");

        library.addBook(book);

        assertTrue(library.findBookById("1").isPresent());
    }

    @Test
    public void testRemoveBook()
    {
        Library library = new Library();
        Book book = new Book("1", "1984", "Orwell");

        library.addBook(book);
        library.removeBook("1");

        assertEquals(0, library.getBooks().size());
    }

}