package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class RoutRunner {
    public static void main(String[] args) {

        Map<String, Boolean> openAirports = new HashMap<>();


        openAirports.put("Warszawa", true);
        openAirports.put("Berlin", false);
        openAirports.put("Tokio", true);
        openAirports.put("Moskwa", false);

        FindFlight findFlight = new FindFlight(openAirports);
        Flight flight = new Flight("Warszawa", "Tokio");

        try {
            findFlight.findFlight(flight);

        } catch (RouteNotFoundException e) {
            System.out.println("Airport closed.");
        }
    }
}
