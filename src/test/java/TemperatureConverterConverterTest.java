import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TemperatureConverterConverterTest {
    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(-17.7778, TemperatureConverterConverter.fahrenheitToCelsius(0), 0.0001);
        assertEquals(0, TemperatureConverterConverter.fahrenheitToCelsius(32), 0.0001);
        assertEquals(100, TemperatureConverterConverter.fahrenheitToCelsius(212), 0.0001);
        assertEquals(-40, TemperatureConverterConverter.fahrenheitToCelsius(-40), 0.0001);
        assertEquals(-566.6667, TemperatureConverterConverter.fahrenheitToCelsius(-988), 0.0001);
    }

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(0, TemperatureConverterConverter.celsiusToFahrenheit(-17.7778), 0.0001);
        assertEquals(32, TemperatureConverterConverter.celsiusToFahrenheit(0), 0.0001);
        assertEquals(212, TemperatureConverterConverter.celsiusToFahrenheit(100), 0.0001);
        assertEquals(-40, TemperatureConverterConverter.celsiusToFahrenheit(-40), 0.0001);
        assertEquals(-988, TemperatureConverterConverter.celsiusToFahrenheit(-566.6667), 0.0001);
    }
}