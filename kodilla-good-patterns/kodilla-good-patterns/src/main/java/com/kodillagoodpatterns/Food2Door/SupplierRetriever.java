package com.kodillagoodpatterns.Food2Door;

import java.util.ArrayList;

public class SupplierRetriever {

    ArrayList<String> manufacturer = new ArrayList<String>();
    ExtraFoodShop extraFoodShop = new ExtraFoodShop();
    GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
    HealthyShop healthyShop = new HealthyShop();


    public void process(Order order){

        manufacturer.add("ExtraFoodShop");
        manufacturer.add("GlutenFreeShop");
        manufacturer.add("HealthyShop");

        if(order.getManufacturer() == manufacturer.get(0)){
            extraFoodShop.process(order);
        }else if(order.getManufacturer() == manufacturer.get(1)){
            glutenFreeShop.process(order);
        }else{
            healthyShop.process(order);
        }
    }
}