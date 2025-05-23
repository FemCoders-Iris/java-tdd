package romannumerals;

public class RomanNumerals {
    public String convert(int number) {
        String romanNumber = "";
        if(number >= 5-1){
            int remainder = 5 - number;
            for (int i = 0; i < remainder; i++) {
                romanNumber += "I";
            }
            romanNumber += "V";

        } else {
            for (int i = 0; i < number; i++) {
                romanNumber += "I";
            }
        }
        return romanNumber;
    }
}
