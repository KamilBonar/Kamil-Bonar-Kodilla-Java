package com.kodillagoodpatterns.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements Supplier {

    private String name = "ExtraFoodShop";
    public final Map<String, Integer> productOfExtraFoodShop = new HashMap<>();

    public ExtraFoodShop() {
        this.name = name;
        putProductsInMap();
    }

    public void putProductsInMap() {
        productOfExtraFoodShop.put("Product1A", 56);
        productOfExtraFoodShop.put("Product2A", 5642);
        productOfExtraFoodShop.put("Product3A", 875);
        productOfExtraFoodShop.put("Product4A", 12546);
    }

    public void process(Order order) {
        if (productOfExtraFoodShop.containsKey(order.getTypeOfProduct())) {
            System.out.println("ExtraFoodShop");
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