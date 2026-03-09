package com.example.library.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {

    private List<Book> books = new ArrayList<>();
    private List<Reader> readers = new ArrayList<>();

    // CREATE
    public void addBook(Book book) {
        books.add(book);
    }

    // READ
    public List<Book> getBooks() {
        return books;
    }

    // UPDATE
    public void updateBookTitle(String id, String newTitle) {
        findBookById(id).ifPresent(book -> book.setTitle(newTitle));
    }

    // DELETE
    public void removeBook(String bookId) {
        books.removeIf(book -> book.getId().equals(bookId));
    }

    public Optional<Book> findBookById(String id) {
        return books.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst();
    }

    // -------- Readers CRUD --------

    public void addReader(Reader reader) {
        readers.add(reader);
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public void removeReader(String readerId) {
        readers.removeIf(reader -> reader.getId().equals(readerId));
    }

    public Optional<Reader> findReaderById(String id) {
        return readers.stream()
                .filter(reader -> reader.getId().equals(id))
                .findFirst();
    }
}