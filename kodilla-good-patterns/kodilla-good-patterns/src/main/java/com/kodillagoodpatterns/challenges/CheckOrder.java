package com.kodillagoodpatterns.challenges;

public class CheckOrder {
    public boolean check(Order order) {
        System.out.println("Check the order");
        System.out.println("Ordered by: " + order.getUser().getName() + " " + order.getUser().getSurname()
                +  " Item: " +order.getThing() + " Quantity: " + order.getQuantity() + " Total price: " + order.getPrice() + "\n");
        return true;
    }
}
