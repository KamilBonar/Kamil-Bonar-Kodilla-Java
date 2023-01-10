package com.kodillagoodpatterns.challenges;

public class NewClient {
    public Order client() {
        User user = new User("Adam", "Nowak");
        String thing = "Car";
        int quantity = 3;
        int price = 15;

        return new Order(user, thing, quantity, price);
    }
}
