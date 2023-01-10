package com.kodillagoodpatterns.challenges;

public class SellProduct {
    public boolean sell(Order order) {
        System.out.println("Sold product");
        System.out.println("Ordered by: " + order.getUser().getName() + " " + order.getUser().getSurname()
                +  " Item: " + order.getThing() + " Quantity: " + order.getQuantity() + " Total price: " + order.getPrice());
        return true;
    }
}
