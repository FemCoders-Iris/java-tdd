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

    @ParameterizedTest
    @CsvSource({
            "14, 'XIV'",
            "15, 'XV'",
            "16, 'XVI'",
            "17, 'XVII'",
            "18, 'XVIII'",
            "19, 'XIX'",
            "20, 'XX'",
            "21, 'XXI'",
            "22, 'XXII'",
            "23, 'XXIII'",
            "24, 'XXIV'",
            "25, 'XXV'",
            "26, 'XXVI'",
            "27, 'XXVII'",
            "28, 'XXVIII'",
            "29, 'XXIX'",
            "30, 'XXX'",
            "31, 'XXXI'",
            "32, 'XXXII'",
            "33, 'XXXIII'",
            "34, 'XXXIV'",
            "35, 'XXXV'",
            "36, 'XXXVI'",
            "37, 'XXXVII'",
            "38, 'XXXVIII'",
            "39, 'XXXIX'",
    })
    void convert_14to39_returnsRomanString(int number, String expectedResult){
        String result = romanNumerals.convert(number);
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "40, 'XL'",
            "50, 'L'",
    })
    void convert_40and50_returnsRomanString(int number, String expectedResult){
        String result = romanNumerals.convert(number);
        assertEquals(expectedResult, result);
    }
}
