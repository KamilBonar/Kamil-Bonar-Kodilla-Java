package com.kodillagoodpatterns.challenges;

public class ProductOrderService {
    private CheckOrder checkOrder;
    private SellProduct sellProduct;
    private MakeOrder makeOrder;

    public ProductOrderService(final CheckOrder checkOrder,
                               final SellProduct sellProduct,
                               final MakeOrder makeOrder) {
        this.checkOrder = checkOrder;
        this.sellProduct = sellProduct;
        this.makeOrder = makeOrder;
    }

    public OrderDto process(final Order order) {
        boolean isBuyed = makeOrder.createOrder(order);
        if(isBuyed) {
            checkOrder.check(order);
            sellProduct.sell(order);
            return new OrderDto(order.getUser(), true);
        } else {
            return new OrderDto(order.getUser(), false);
        }
    }
}
