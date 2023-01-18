package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testCalculations() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double sum = calculator.add(5, 7);
        double difference = calculator.sub(9, 7);
        double multiply = calculator.mul(3, 8);
        double result = calculator.div(15, 5);

        //Then
        Assertions.assertEquals(12, sum);
        Assertions.assertEquals(2, difference);
        Assertions.assertEquals(24, multiply);
        Assertions.assertEquals(3, result);
    }
}