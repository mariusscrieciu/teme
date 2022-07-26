package com.fasttrackit;

import com.fasttrackit.temperature.TemperatureConverter;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TemperatureTest {

    @Test
    public void fromFahrenheitToCelsius100() {
        double fTemperature = 100;
        double result = (int) TemperatureConverter.fahrenheitToCelsius(fTemperature);
        Assertions.assertThat(result).isEqualTo(37);
    }

    @Test
    public void fromFahrenheitToCelsius50() {
        double fTemperature = 50;
        double result = TemperatureConverter.fahrenheitToCelsius(fTemperature);
        Assertions.assertThat(result).isEqualTo(10);
    }

    @Test
    public void fromFahrenheitToCelsius0() {
        double fTemperature = 0;
        int result = (int)TemperatureConverter.fahrenheitToCelsius(fTemperature);
        Assertions.assertThat(result).isEqualTo(-17);
    }


    @Test
    public void fromCelsiusToFahrenheit(){
        double cTemperature = 37;
        double result = (int)TemperatureConverter.celsiusToFahrenheit(cTemperature);
        Assertions.assertThat(result).isEqualTo(98);
    }


}
