package com.kodillagoodpatterns.Airport;

import java.util.Objects;

public class Flight {

    private final String flightTo;
    private final String flightFrom;

    public Flight(String flightTo, String flightFrom) {
        this.flightTo = flightTo;
        this.flightFrom = flightFrom;
    }

    public String getFlightTo() {
        return flightTo;
    }

    public String getFlightFrom() {
        return flightFrom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return flightTo.equals(flight.flightTo) && flightFrom.equals(flight.flightFrom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightTo, flightFrom);
    }
}