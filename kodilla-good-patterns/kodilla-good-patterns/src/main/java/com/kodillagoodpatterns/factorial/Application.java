package com.kodillagoodpatterns.factorial;

public class Application {
    public static void main(String[] args) {

        InputText inputText = new InputText();
        Factorial factorial = new Factorial();

        System.out.println("Please enter a number to calculate the factorial:");
        int n = inputText.input();
        int result = factorial.getFactorial(n);
        System.out.println("Factorial from " + n + " equals: " + result);
    }
}