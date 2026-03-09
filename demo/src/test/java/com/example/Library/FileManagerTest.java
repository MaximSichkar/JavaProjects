package com.example.Library;

import com.example.library.io.LibraryFileManager;
import com.example.library.model.Book;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.mockito.Mockito.*;

public class FileManagerTest
{

    @Test
    public void testSaveCalled()
    {
        LibraryFileManager manager = Mockito.mock(LibraryFileManager.class);

        Book book = new Book("1", "1984", "Orwell");

        manager.save(List.of(book));

        verify(manager).save(anyList());
    }

}