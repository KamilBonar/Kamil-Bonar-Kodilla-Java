package com.kodillagoodpatterns.challenges;

import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        //13.1
        MovieStore movieStore = new MovieStore();

        String titlesWithExclamationMark = movieStore.getMovies().entrySet().stream()
                .flatMap(title -> title.getValue().stream())
                .collect(Collectors.joining(" ! "));

        System.out.println(titlesWithExclamationMark);

        //13.2
        NewClient newClient = new NewClient();
        Order order = newClient.client();

        ProductOrderService productOrderService = new ProductOrderService(new CheckOrder(), new SellProduct(), new MakeOrder());
        productOrderService.process(order);

    }
}
