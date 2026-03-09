package com.example.library.service;

import java.util.*;

import com.example.library.io.LibraryFileManager;
import com.example.library.model.Book;
import com.example.library.model.Reader;

public class LibraryService {

    private List<Book> books;
    private List<Reader> readers = new ArrayList<>();
    private LibraryFileManager fileManager;

    public LibraryService() {
        fileManager = new LibraryFileManager();
        books = fileManager.load();
    }

    public void addBook(String title, String author) {
        String id = UUID.randomUUID().toString();
        books.add(new Book(id, title, author));
        fileManager.save(books);
    }

    public void listBooks() {
        for (Book b : books) {
            System.out.println(b.getId() + " | " + b.getTitle() + " | " + b.getAuthor() + " | borrowed=" + b.isBorrowed());
        }
    }

    public void addReader(String id, String name) {
        readers.add(new Reader(id, name));
    }

    public Optional<Book> findBook(String id) {
        return books.stream()
                .filter(b -> b.getId().equals(id))
                .findFirst();
    }

    public Optional<Reader> findReader(String id) {
        return readers.stream()
                .filter(r -> r.getId().equals(id))
                .findFirst();
    }

    public void borrowBook(String readerId, String bookId) {
        Optional<Reader> reader = findReader(readerId);
        Optional<Book> book = findBook(bookId);

        if (reader.isPresent() && book.isPresent()) {
            reader.get().borrowBook(book.get());
        }
    }

    public void returnBook(String readerId, String bookId) {
        Optional<Reader> reader = findReader(readerId);
        Optional<Book> book = findBook(bookId);

        if (reader.isPresent() && book.isPresent()) {
            reader.get().returnBook(book.get());
        }
    }
}