package com.kodillagoodpatterns.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Supplier {

    private String name = "HealthyShop";
    public final Map<String, Integer> productOfHealthyShop = new HashMap<>();

    public HealthyShop() {
        this.name = name;
        putProductsInMap();
    }

    public void putProductsInMap() {
        productOfHealthyShop.put("Product1C", 56);
        productOfHealthyShop.put("Product2C", 5642);
        productOfHealthyShop.put("Product3C", 875);
        productOfHealthyShop.put("Product4C", 12546);
    }

    public void process(Order order) {
        if (productOfHealthyShop.containsKey(order.getTypeOfProduct())) {
            System.out.println("HealthyShop");
            System.out.println("Your order number is: " + order.getOrderNumber());
            System.out.println("You ordered " + order.getTypeOfProduct() + " in quantity " + order.getQuantity());
        } else {
            System.out.println("The selected product is not available.");
        }
    }

    public String getName() {
        return name;
    }
}