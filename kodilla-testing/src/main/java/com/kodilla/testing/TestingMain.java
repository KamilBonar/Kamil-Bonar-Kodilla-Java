package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator addValue = new Calculator();

        int resultAdd = addValue.add(5, 5);

        if (resultAdd == 10) {
            System.out.println("Add test OK");
        } else {
            System.out.println("Add Error!");
        }

        Calculator subtractValue = new Calculator();

        int resultSubtract = subtractValue.subtract(5, 4);

        if (resultSubtract == 1) {
            System.out.println("Subtract test OK");
        } else {
            System.out.println("Subtract Error!");
        }
    }
}
