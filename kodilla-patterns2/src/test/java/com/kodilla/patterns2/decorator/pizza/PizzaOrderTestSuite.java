package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost(){

        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //When
        BigDecimal cost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(16), cost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription(){

        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //When
        String description = pizzaOrder.getDescription();

        //Then
        assertEquals("Pizza ingredients: cheese, tomato sauce", description);
    }

    @Test
    public void testOnionAndSalamiPizzaOrderGetCost(){

        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new Onion(pizzaOrder);
        pizzaOrder = new Salami(pizzaOrder);

        //When
        BigDecimal cost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(23), cost);
    }

    @Test
    public void testPineappleAndHamPizzaOrderGetDescription(){

        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new Onion(pizzaOrder);
        pizzaOrder = new Salami(pizzaOrder);

        //When
        String description = pizzaOrder.getDescription();

        //Then
        assertEquals("Pizza ingredients: cheese, tomato sauce, onion, salami", description);
    }
}