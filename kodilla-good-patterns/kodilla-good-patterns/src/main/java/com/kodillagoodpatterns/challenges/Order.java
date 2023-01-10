package com.kodillagoodpatterns.challenges;

public class Order {
    public User user;
    public String thing;
    public int quantity;
    public int price;

    public Order(User user, String thing,int quantity, int price) {
        this.user = user;
        this.thing = thing;
        this.quantity = quantity;
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public String getThing() {
        return thing;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price * quantity;
    }
}
