package com.daehosting;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConversionsTest {

    @Test
    void getTemperatureConversionsSoap() {
    }

    @Test
    void getTemperatureConversionsSoap1() {
    }

    @Test
    void getTemperatureConversionsSoap12() {
        TemperatureConversionsSoapType service1 = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal result1 = service1.celsiusToFahrenheit(BigDecimal.valueOf(0));
        assertEquals(BigDecimal.valueOf(32), result1);

        TemperatureConversionsSoapType service2 = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal result2 = service2.fahrenheitToCelsius(BigDecimal.valueOf(32));
        assertEquals(BigDecimal.valueOf(0), result2);

        TemperatureConversionsSoapType service3 = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal result3 = service3.windChillInCelsius(BigDecimal.valueOf(0), BigDecimal.valueOf(40));
        assertEquals(BigDecimal.valueOf(-25.23), result3);

        TemperatureConversionsSoapType service4 = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal result4 = service4.windChillInFahrenheit(BigDecimal.valueOf(78), BigDecimal.valueOf(40));
        assertEquals(BigDecimal.valueOf(65.7059999), result4);
    }

    @Test
    void getTemperatureConversionsSoap121() {
    }
}