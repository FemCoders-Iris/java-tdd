package fizzbuzz;

//Write a function that takes positive integers and outputs their string representation.
//
//Your function should comply with the following additional rules:
//
//If the number is a multiple of three, return the string "Fizz".
//If the number is a multiple of five, return the string "Buzz".
//If the number is a multiple of both three and five, return the string "FizzBuzz".

import fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    FizzBuzz fizzbuzz;

    @BeforeEach
    void setUpBeforeEach(){
        fizzbuzz = new FizzBuzz();
    }

    @ParameterizedTest
    @CsvSource({
            "1, '1'",
            "2, '2'",
            "4, '4'",
    })
    void convert_integerNotMultiple_returnsString(int number, String expectedOutput){
        String result = fizzbuzz.convert(number);
        assertEquals(expectedOutput, result);
    }

    @ParameterizedTest
    @CsvSource({
            "3",
            "6",
            "9",
    })
    void convert_multiple3_returnsFizz(int number){
        String result = fizzbuzz.convert(number);
        assertEquals("Fizz", result);
    }

    @ParameterizedTest
    @CsvSource({
            "5",
            "10",
            "20"
    })
    void convert_multiple5_returnsBuzz(int number){
        String result = fizzbuzz.convert(number);
        assertEquals("Buzz", result);
    }

    @ParameterizedTest
    @CsvSource({
            "15",
            "30",
            "45"
    })
    void convert_multiple3and5_returnsFizzBuzz(int number){
        String result = fizzbuzz.convert(number);
        assertEquals("FizzBuzz", result);
    }

    @ParameterizedTest
    @CsvSource({
            "1, '1'",
            "3, 'Fizz'",
            "5, 'Buzz'"
    })
    void convert_integer_returnsString(int number, String expectedOutput){
        String result = fizzbuzz.convert(number);
        assertEquals(expectedOutput, result);
    }

    /*
    @ParameterizedTest
    @CsvSource({
            "8, 2, 4",
            "45, 5, 9",
            "12, 3, 4"
    })
    void multiple3ans5_returnsFizzBuzz(int number){
        String result = fizzbuzz.convert(number);
        assertEquals("FizzBuzz", result);
    }*/
}
