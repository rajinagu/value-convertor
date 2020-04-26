package com.playsafe.service;

import org.springframework.stereotype.Component;

@Component
public class ValueConversionService {

    public double convertKelvinToCelsius(double kelvinValue){

        return kelvinValue - 273.15;
    }

    public double convertCelsiusToKelvin(double celsiusValue){

        return celsiusValue + 273.15;
    }

    public double convertMilesToKilometer(double milesValue){

        return milesValue * 1.609344;
    }

    public double convertKilometerToMiles(double kmValue){

        return kmValue/1.609344;
    }


}
