package com.kodillagoodpatterns.Airport;

public class Application {

    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();

        flightFinder.findFlightsFrom("Warszawa");
        flightFinder.findFlightsTo("Poznan");
        flightFinder.findFlightsThrough("Wroclaw", "Poznan");
    }
}