package com.kodillagoodpatterns.challenges;

public class MakeOrder {
    public boolean createOrder(Order order) {
        System.out.println("New order");
        System.out.println("Ordered by: " + order.getUser().getName() + " " + order.getUser().getSurname()
                + " Item: " + order.getThing() + " Quantity: " + order.getQuantity() + " Total price: " + order.getPrice() + "\n");
        return true;
    }
}
