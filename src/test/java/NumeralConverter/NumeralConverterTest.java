package NumeralConverter;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class NumeralConverterTest {
    @Test
    public void testConvertToRoman() throws Exception {

        //Act
        Assertions.assertEquals("", NumeralConverter.convertToRoman(0));
        Assertions.assertEquals("I", NumeralConverter.convertToRoman(1));
        Assertions.assertEquals("II", NumeralConverter.convertToRoman(2));
        Assertions.assertEquals("IV", NumeralConverter.convertToRoman(4));
        Assertions.assertEquals("V", NumeralConverter.convertToRoman(5));
        Assertions.assertEquals("X", NumeralConverter.convertToRoman(10));
        Assertions.assertEquals("XXIII", NumeralConverter.convertToRoman(23));
        Assertions.assertEquals("L", NumeralConverter.convertToRoman(50));
        Assertions.assertEquals("LX", NumeralConverter.convertToRoman(60));
        Assertions.assertEquals("CXXIII", NumeralConverter.convertToRoman(123));
        Assertions.assertEquals("CCC", NumeralConverter.convertToRoman(300));
        Assertions.assertEquals("CCCL", NumeralConverter.convertToRoman(350));
        Assertions.assertEquals("CD", NumeralConverter.convertToRoman(400));
        Assertions.assertEquals("DCCCXC", NumeralConverter.convertToRoman(890));
        Assertions.assertEquals("CM", NumeralConverter.convertToRoman(900));
        Assertions.assertEquals("MXCVIII", NumeralConverter.convertToRoman(1098));
        Assertions.assertEquals("MCMXCIV", NumeralConverter.convertToRoman(1994));
        Assertions.assertEquals("MMMMMMMMMM", NumeralConverter.convertToRoman(10000));
        Assertions.assertEquals("MMMMMMMMMMMMMMMMMMMMMMMCMLXXXVIII", NumeralConverter.convertToRoman(23988));

    }

    @Test
    public void testConvertToRomanErrorHandlingNegative() throws Exception {

        //Act
        Exception exception = assertThrows(Exception.class, () -> {
            NumeralConverter.convertToRoman(-1);
        });
        String expectedMessage = "Unable to convert to Roman";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
