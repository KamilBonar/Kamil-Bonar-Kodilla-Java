package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    void testGetBooks(){
        //Given
        LocalDate publicationDateOfBook1 = LocalDate.of(2022,2,24);
        LocalDate publicationDateOfBook2 = LocalDate.of(1789,5,14);
        LocalDate publicationDateOfBook3 = LocalDate.of(1209,7,13);

        Book book1 = new Book("Title1","Author1", publicationDateOfBook1);
        Book book2 = new Book("Title2", "Author2",publicationDateOfBook2);
        Book book3 = new Book("Title3", "Author3",publicationDateOfBook3);

        Library library = new Library("Library");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assertions.assertEquals(2, library.getBooks().size());
        Assertions.assertEquals(2, clonedLibrary.getBooks().size());
        Assertions.assertEquals(3, deepClonedLibrary.getBooks().size());
        Assertions.assertEquals(library.getBooks(), clonedLibrary.getBooks());
        Assertions.assertNotEquals(library.getBooks(), deepClonedLibrary.getBooks());
    }
}