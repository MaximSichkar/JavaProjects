package com.example.Library;

import com.example.library.model.Book;
import com.example.library.model.Reader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReaderTest
{

    @Test
    public void testBorrowBook()
    {
        Reader reader = new Reader("1", "John");
        Book book = new Book("1", "1984", "Orwell");

        reader.borrowBook(book);

        assertFalse(book.isAvailable());
    }

    @Test
    public void testReturnBook()
    {
        Reader reader = new Reader("1", "John");
        Book book = new Book("1", "1984", "Orwell");

        reader.borrowBook(book);
        reader.returnBook(book);

        assertTrue(book.isAvailable());
    }

    @Test
    public void testReaderEquals()
    {
        Reader r1 = new Reader("1", "John");
        Reader r2 = new Reader("1", "John");

        assertEquals(r1, r2);
    }

}