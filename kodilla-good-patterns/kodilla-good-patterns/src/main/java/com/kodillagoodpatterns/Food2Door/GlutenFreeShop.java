package com.kodillagoodpatterns.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Supplier {

    private String name = "GlutenFreeShop";
    public final Map<String, Integer> productOfGlutenFreeShop = new HashMap<>();

    public GlutenFreeShop() {
        this.name = name;
        putProductsInMap();
    }

    public void putProductsInMap() {
        productOfGlutenFreeShop.put("Product1B", 56);
        productOfGlutenFreeShop.put("Product2B", 5642);
        productOfGlutenFreeShop.put("Product3B", 875);
        productOfGlutenFreeShop.put("Product4B", 12546);
    }

    public void process(Order order) {
        if (productOfGlutenFreeShop.containsKey(order.getTypeOfProduct())) {
            System.out.println("GlutenFreeShop");
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