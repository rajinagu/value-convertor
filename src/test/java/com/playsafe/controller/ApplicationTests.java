package com.playsafe.controller;

import com.playsafe.service.ValueConversionService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class ApplicationTests {

        private ValueConversionService conversionService = new ValueConversionService();


    @Test
    void testKelvinToCelsius() {
        double kelvinValue = 100;
        double celsiusValue = conversionService.convertKelvinToCelsius(kelvinValue);

        assert(new BigDecimal(String.valueOf(celsiusValue)).setScale(2, BigDecimal.ROUND_UP).doubleValue()==-173.15);
    }

    //Negative value
    @Test
    void testKelvinToCelsiusNegative() {
        double kelvinValue = -100;
        double celsiusValue = conversionService.convertKelvinToCelsius(kelvinValue);

        assert(new BigDecimal(String.valueOf(celsiusValue)).setScale(2, BigDecimal.ROUND_UP).doubleValue()==-373.15);
    }

    @Test
    void testCelsiusToKelvin() {
        double celsiusValue = 100;
        double kelvinValue = conversionService.convertCelsiusToKelvin(celsiusValue);

        assert(new BigDecimal(String.valueOf(kelvinValue)).setScale(2, BigDecimal.ROUND_UP).doubleValue()==373.15);
    }

    @Test
    void testCelsiusToKelvinNegative() {
        double celsiusValue = -100;
        double kelvinValue = conversionService.convertCelsiusToKelvin(celsiusValue);

        assert(new BigDecimal(String.valueOf(kelvinValue)).setScale(2, BigDecimal.ROUND_UP).doubleValue()==173.15);
    }

    @Test
    void testKMToMiles() {
        double kilometer = 100;
        double miles = conversionService.convertKilometerToMiles(kilometer);

        assert(new BigDecimal(String.valueOf(miles)).setScale(2, BigDecimal.ROUND_UP).doubleValue()==62.14);
    }

    //Negative value
    @Test
    void testKMToMilesNegative() {
        double kilometer = -100;
        double miles = conversionService.convertKilometerToMiles(kilometer);

        assert(new BigDecimal(String.valueOf(miles)).setScale(2, BigDecimal.ROUND_UP).doubleValue()==-62.14);
    }

    @Test
    void testMilesToKM() {
        double miles = 100;
        double km = conversionService.convertMilesToKilometer(miles);

        assert(new BigDecimal(String.valueOf(km)).setScale(2, BigDecimal.ROUND_UP).doubleValue()==160.94);
    }

    @Test
    void testMilesToKMNegative() {
        double miles = -100;
        double km = conversionService.convertMilesToKilometer(miles);

        assert(new BigDecimal(String.valueOf(km)).setScale(2, BigDecimal.ROUND_UP).doubleValue()==-160.94);
    }

}
