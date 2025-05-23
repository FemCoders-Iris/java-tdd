package romannumerals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsTest {
    RomanNumerals romanNumerals;

    @BeforeEach
    void setUpBeforeEach() {
        romanNumerals = new RomanNumerals();
    }

    @ParameterizedTest
    @CsvSource({
            "1, 'I'",
            "2, 'II'",
            "3, 'III'",
    })
    void convert_1to3_returnsRomanString(int number, String expectedResult){
        String result = romanNumerals.convert(number);
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "4, 'IV'",
            "5, 'V'",
    })
    void convert_4to5_returnsRomanString(int number, String expectedResult){
        String result = romanNumerals.convert(number);
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "6, 'VI'",
            "7, 'VII'",
            "8, 'VIII'",
    })
    void convert_6to8_returnsRomanString(int number, String expectedResult){
        String result = romanNumerals.convert(number);
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "9, 'IX'",
            "10, 'X'",
            "11, 'XI'",
            "12, 'XII'",
            "13, 'XIII'"
    })
    void convert_9to13_returnsRomanString(int number, String expectedResult){
        String result = romanNumerals.convert(number);
        assertEquals(expectedResult, result);
    }
}
