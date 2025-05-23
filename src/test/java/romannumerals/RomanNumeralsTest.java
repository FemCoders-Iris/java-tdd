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
}
