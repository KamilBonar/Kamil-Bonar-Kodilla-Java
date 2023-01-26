package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {

    @Test
    void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("bun without sesame")
                .burgers(2)
                .sauce("standard")
                .ingredient("cheese")
                .ingredient("onion")
                .ingredient("tomato")
                .ingredient("cucumber")
                .build();

        //When
        int amountOfIngredients = bigmac.getIngredients().size();
        String sauce = bigmac.getSauce();

        //Then
        Assertions.assertEquals(4, amountOfIngredients);
        Assertions.assertEquals("standard", sauce);
    }
}