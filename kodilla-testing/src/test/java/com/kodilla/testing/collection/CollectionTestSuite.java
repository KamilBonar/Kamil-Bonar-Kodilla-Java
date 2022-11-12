package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    private static OddNumbersExterminator oddNumbersExterminator;

    @BeforeEach
    public void before() {
        System.out.println("Test: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test: end");
    }

    @DisplayName(
            "Testing empty list"
    )

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        oddNumbersExterminator = new OddNumbersExterminator();

        //Given
        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        List<Integer> resultList = oddNumbersExterminator.exterminate(emptyList);
        System.out.println( "Testing empty list");
        //Then
        Assertions.assertEquals(emptyList, resultList);
    }

    @DisplayName(
            "Testing the list"
    )

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> theList = new ArrayList<>();
        for(int i =1; i<=10; i++) {
            theList.add(i);
        }

        ArrayList<Integer>expectedList = new ArrayList<>();
        expectedList.add(2);
        expectedList.add(4);
        expectedList.add(6);
        expectedList.add(8);
        expectedList.add(10);
        //When
        List<Integer> resultList = oddNumbersExterminator.exterminate(theList);
        System.out.println( "Testing the list");
        //Then
        Assertions.assertEquals(expectedList, resultList);
    }
}
