package romannumerals;

public class RomanNumerals {
    public String convert(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        while(true) {
            if (number >= 9) {
                int remainder = number - 10;
                if(remainder > 0){
                    stringBuilder.append("X");
                    number = remainder;
                } else{
                    for (int i = 0; i < -remainder; i++) {
                        stringBuilder.append("I");
                    }
                    stringBuilder.append("X");
                    break;
                }
            } else if (number >= 4) {
                int remainder = number - 5;
                if(remainder > 0){
                    stringBuilder.append("V");
                    number = remainder;
                } else{
                    for (int i = 0; i < -remainder; i++) {
                        stringBuilder.append("I");
                    }
                    stringBuilder.append("V");
                    break;
                }
            } else {
                for (int i = 0; i < number; i++) {
                    stringBuilder.append("I");
                }
                break;
            }
        }
        return stringBuilder.toString();
    }
}
