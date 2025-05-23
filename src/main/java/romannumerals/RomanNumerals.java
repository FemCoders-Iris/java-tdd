package romannumerals;

public class RomanNumerals {
    public String convert(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        if(number > 5){
            int remainder = number - 5;
            stringBuilder.append("V");
            for (int i = 0; i < remainder; i++) {
                stringBuilder.append("I");
            }
        } else if(number >= 5-1){
            int remainder = 5 - number;
            for (int i = 0; i < remainder; i++) {
                stringBuilder.append("I");
            }
            stringBuilder .append("V");

        } else {
            for (int i = 0; i < number; i++) {
                stringBuilder.append("I");
            }
        }
        return stringBuilder.toString();
    }
}
