package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {
    Map<String, Boolean> airports = new HashMap<>();

    public FindFlight(Map<String, Boolean> airports) {
        this.airports = airports;
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {

        if (airports.get(flight.getDepartureAirport())) {
            System.out.println("You can start.");
        } else {
            throw new RouteNotFoundException();
        }

        if (airports.get(flight.getArrivalAirport())) {
            System.out.println("You can land.");
        } else {
            throw new RouteNotFoundException();
        }

    }
}
