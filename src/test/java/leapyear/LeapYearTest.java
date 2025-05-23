package leapyear;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearTest {
    LeapYear leapYear;

    @BeforeEach
    void setUpBeforeEach() {
        leapYear = new LeapYear();
    }

    @Test
    void isLeapYear_notDivisible4_returnsFalse(){
        int year = 1997;
        boolean result = leapYear.isLeapYear(year);
        assertEquals(false, result);
    }

    @Test
    void isLeapYear_Divisible4_returnsTrue(){
        int year = 1996;
        boolean result = leapYear.isLeapYear(year);
        assertEquals(true, result);
    }

    @Test
    void isLeapYear_Divisible400_returnsTrue(){
        int year = 1600;
        boolean result = leapYear.isLeapYear(year);
        assertEquals(true, result);
    }

    @Test
    void isLeapYear_Divisible100NotDivisible400_returnsFalse(){
        int year = 1800;
        boolean result = leapYear.isLeapYear(year);
        assertEquals(false, result);
    }
}


