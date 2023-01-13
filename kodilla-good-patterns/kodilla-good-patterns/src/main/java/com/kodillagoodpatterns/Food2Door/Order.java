package com.kodillagoodpatterns.Food2Door;

public class Order {

    private final int quantity;
    private final String typeOfProduct;
    private final int orderNumber;
    private final String manufacturer;

    public Order(String manufacturer, String typeOfProduct, int quantity, int orderNumber) {
        this.quantity = quantity;
        this.typeOfProduct = typeOfProduct;
        this.orderNumber = orderNumber;
        this.manufacturer = manufacturer;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getTypeOfProduct() {
        return typeOfProduct;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}