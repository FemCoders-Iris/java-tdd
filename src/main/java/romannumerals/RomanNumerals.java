package romannumerals;

public class RomanNumerals {
    public String convert(int number) {
        String romanNumber = "";
        for (int i = 0; i < number / 1; i++) {
            romanNumber += "I";
        }
        return romanNumber;
    }
}
