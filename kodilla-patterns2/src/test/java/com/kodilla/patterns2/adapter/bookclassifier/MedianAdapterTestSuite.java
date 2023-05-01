package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest(){
        //Given
        Book book1 = new Book("Adam Mickiewicz", "Pan Tadeusz", 1832, "4589647");
        Book book2 = new Book("Henryk Sienkiewicz", "Ogniem i mieczem", 1884, "5867423");
        Book book3 = new Book("Remigiusz Mróz", "Behawiorysta", 2016, "5964123");
        Book book4 = new Book("Henryk Sienkiewicz", "Potop", 1886, "4576386");

        Set<Book> bookSet = new HashSet<>();

        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(1886, median);
    }
}