package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given

        Country country1 = new Country("Germany", new BigDecimal("83010000"));
        Country country2 = new Country("Slovakia", new BigDecimal("5440000"));
        Country country3 = new Country("France", new BigDecimal("67500000"));
        Country country4 = new Country("Spain", new BigDecimal("47300000"));
        Country country5 = new Country("Poland", new BigDecimal("37800000"));
        Country country6 = new Country("Russian", new BigDecimal("143000000"));
        Country country7 = new Country("Japan", new BigDecimal("125700000"));
        Country country8 = new Country("China", new BigDecimal("1400000000"));
        Country country9 = new Country("RPA", new BigDecimal("60000000"));
        Country country10 = new Country("Egypt", new BigDecimal("104000000"));
        Country country11 = new Country("Morocco", new BigDecimal("37300000"));

        Continent continent1 = new Continent("Europe");
        Continent continent2 = new Continent("Asia");
        Continent continent3 = new Continent("Africa");
        List<Country> countryList = new ArrayList<>();

        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent1.addCountry(country3);
        continent1.addCountry(country4);
        continent1.addCountry(country5);

        continent2.addCountry(country6);
        continent2.addCountry(country7);
        continent2.addCountry(country8);

        continent3.addCountry(country9);
        continent3.addCountry(country10);
        continent3.addCountry(country11);

        World world = new World();
        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);

        //When
        BigDecimal totalPeopleQuantity = world.getPeopleQuantity();

        //Then
        assertEquals(totalPeopleQuantity, new BigDecimal("2111050000"));


    }
}