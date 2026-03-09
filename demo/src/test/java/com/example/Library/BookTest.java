package com.example.Library;

import com.example.library.model.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookTest
{

    @Test
    public void testBorrowBook()
    {
        Book book = new Book("1", "1984", "Orwell");

        book.borrow();

        assertFalse(book.isAvailable());
    }

    @Test
    public void testReturnBook()
    {
        Book book = new Book("1", "1984", "Orwell");

        book.borrow();
        book.returnBook();

        assertTrue(book.isAvailable());
    }

    @Test
    public void testEquals()
    {
        Book b1 = new Book("1", "1984", "Orwell");
        Book b2 = new Book("1", "1984", "Orwell");

        assertEquals(b1, b2);
    }

}