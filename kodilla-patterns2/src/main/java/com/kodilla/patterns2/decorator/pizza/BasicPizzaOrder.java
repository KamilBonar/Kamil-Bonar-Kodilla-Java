package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder {


    @Override
    public BigDecimal getCost() {
        return new BigDecimal(16);
    }

    @Override
    public String getDescription() {
        return "Pizza ingredients: cheese, tomato sauce";
    }
}