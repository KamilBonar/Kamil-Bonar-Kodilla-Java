package com.kodillagoodpatterns.Airport;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {
    public static List<Flight> getFlightList() {

        final List<Flight> flightList = new ArrayList<>();

        flightList.add(new Flight("Gdansk", "Krakow"));
        flightList.add(new Flight("Warszawa", "Poznan"));
        flightList.add(new Flight("Krakow", "Katowice"));
        flightList.add(new Flight("Rzeszow", "Wroclaw"));

        return new ArrayList<>(flightList);
    }

    public List<Flight> findFlightsFrom(String departureCity) {

        List<Flight> flightsFrom = getFlightList().stream()
                .filter(s -> s.getFlightFrom().equals(departureCity))
                .collect(Collectors.toList());
        return flightsFrom;
    }

    public List<Flight> findFlightsTo(String arrivalCity) {
        List<Flight> flightsTo = getFlightList().stream()
                .filter(s -> s.getFlightTo().equals(arrivalCity))
                .collect(Collectors.toList());
        return flightsTo;
    }

    public List<Flight> findFlightsThrough(String viaCity, String arrivalCity) {
        List<Flight> flightsThrough = getFlightList().stream()
                .filter(s -> s.getFlightTo().equals(arrivalCity))
                .filter(s -> s.getFlightFrom().equals(viaCity))
                .collect(Collectors.toList());
        return flightsThrough;
    }
}
