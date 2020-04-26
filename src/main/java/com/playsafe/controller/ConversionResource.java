package com.playsafe.controller;

import com.playsafe.service.ValueConversionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import javax.ws.rs.QueryParam;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Path("conversion")
public class ConversionResource {

    Logger log = LoggerFactory.getLogger(ConversionResource.class);

    @Autowired
    private ValueConversionService conversionService;

    @GET
    @Path("ktoc")
    public String getKelvinToCelsius(@QueryParam("value") String kelvinValue){
        try{
            LocalDateTime start = LocalDateTime.now();
            double celsiusValue = conversionService.convertKelvinToCelsius(Double.parseDouble(kelvinValue));

            LocalDateTime end = LocalDateTime.now();
            long duration = ChronoUnit.NANOS.between(start, end);
            log.info("KelvinToCelsius Request processed in " + duration + " nanoseconds ");

            return "Celsius Value : " + new BigDecimal(String.valueOf(celsiusValue)).setScale(2, BigDecimal.ROUND_UP) + "\u00B0C for Kelvin Value: " + kelvinValue+"K";
        }catch(NumberFormatException ne){
            log.error("Invalid Number");
            return "Please enter the Value in number";
        }

    }

    @GET
    @Path("ctok")
    public String getCelsiusToKelvin(@QueryParam("value") String celsiusValue){

        try{
            LocalDateTime start = LocalDateTime.now();
            double kelvinValue = conversionService.convertCelsiusToKelvin(Double.parseDouble(celsiusValue));

            LocalDateTime end = LocalDateTime.now();
            long duration = ChronoUnit.NANOS.between(start, end);
            log.info("CelsiusToKelvin Request processed in " + duration + " nanoseconds ");

            return "Kelvin Value : " + new BigDecimal(String.valueOf(kelvinValue)).setScale(2, BigDecimal.ROUND_UP) + "K for Celsius Value: " + celsiusValue+"\u00B0C";
        }catch(NumberFormatException ne){
            log.error("Invalid Number");
            return "Please enter the Value in number";
        }
    }

    @GET
    @Path("mtok")
    public String getMilesToKilometer(@QueryParam("value") String milesValue){

        try{
            LocalDateTime start = LocalDateTime.now();
            double kilometerValue = conversionService.convertMilesToKilometer(Double.parseDouble(milesValue));

            LocalDateTime end = LocalDateTime.now();
            long duration = ChronoUnit.NANOS.between(start, end);
            log.info("MilesToKilometer Request processed in " + duration + " nanoseconds ");

            return "KiloMeter Value : " + new BigDecimal(String.valueOf(kilometerValue)).setScale(2, BigDecimal.ROUND_UP) + "KM for Miles Value: " + milesValue+"M";
        }catch(NumberFormatException ne){
            log.error("Invalid Number");
            return "Please enter the Value in number";
        }
    }

    @GET
    @Path("ktom")
    public String getKilometerToMiles(@QueryParam("value") String kilometerValue){

        try{
            LocalDateTime start = LocalDateTime.now();
            double milesValue = conversionService.convertKilometerToMiles(Double.parseDouble(kilometerValue));

            LocalDateTime end = LocalDateTime.now();
            long duration = ChronoUnit.NANOS.between(start, end);
            log.info("KilometerToMiles Request processed in " + duration + " nanoseconds ");

            return "Miles Value : " + new BigDecimal(String.valueOf(milesValue)).setScale(2, BigDecimal.ROUND_UP) + "M for KiloMeter Value: " + kilometerValue+"KM";
        }catch(NumberFormatException ne){
            log.error("Invalid Number");
            return "Please enter the Value in number";
        }
    }

}



