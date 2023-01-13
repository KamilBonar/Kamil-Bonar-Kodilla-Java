package com.kodillagoodpatterns.Food2Door;

public class Application {
        public static void main(String[] args) {

            Order order1 = new Order("ExtraFoodShop", "Product1A", 5, 458962);
            Order order2 = new Order("GlutenFreeShop", "Product1B", 22, 452425);
            Order order3 = new Order("HealthyShop", "Product1C", 45, 879878);

            SupplierRetriever supplierRetriever = new SupplierRetriever();
            supplierRetriever.process(order1);
            supplierRetriever.process(order2);
            supplierRetriever.process(order3);
        }
}
