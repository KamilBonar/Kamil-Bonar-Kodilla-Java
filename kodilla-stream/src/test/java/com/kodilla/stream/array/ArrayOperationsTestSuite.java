package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {
    private final int[] test = new int[20];

    @Test
    public void testGetAverage() {
        for (int i = 0; i < 20; i++) {
            test[i] = i +2;
        }
        //When
        double average = ArrayOperations.getAverage(test);
        //Then
        Assertions.assertEquals(11.5, average);

    }
}