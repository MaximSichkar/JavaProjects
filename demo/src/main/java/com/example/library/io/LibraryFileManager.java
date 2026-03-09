package com.example.library.io;

import java.io.*;
import java.util.*;
import com.example.library.model.Book;

public class LibraryFileManager 
{

    private final String FILE = "library.txt";

    public void save(List<Book> books) {
        try (PrintWriter writer = new PrintWriter(FILE)) {
            for (Book b : books) {
                writer.println(b);
            }
        } catch (Exception ignored) {}
    }

    public List<Book> load() 
    {
        List<Book> books = new ArrayList<>();
        File file = new File(FILE);

        if (!file.exists()) return books;

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                books.add(Book.fromString(sc.nextLine()));
            }
        } catch (Exception ignored) {}

        return books; 
    }
    
    public void saveSorted(List<Book> books) 
    {
        books.sort(Comparator.comparing(Book::getTitle));
    
        try (PrintWriter writer = new PrintWriter(FILE)) 
        {
            for (Book b : books) 
            {
                writer.println(b);
            }
        } catch (Exception ignored) {}

    }      
}