package romannumerals;

public class RomanNumerals {
    public String convert(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        int units;
        int tens = 0;
        int unitsRemainder, tensRemainder;

        if (number > 9){
            tens = (int) Math.floor(number/10);
            units = number -tens * 10;
        } else{
            units = number;
        }
        //Tens
        while(true) {
            if (tens >= 4) {
                tensRemainder = tens - 5;
                if (tensRemainder > 0) {
                    stringBuilder.append("L");
                    tens = tensRemainder;
                } else {
                    stringBuilder.append("X".repeat(-tensRemainder));
                    stringBuilder.append("L");
                    break;
                }
            } else {
                stringBuilder.append("X".repeat(Math.max(0, tens)));
                break;
            }
        }
        //Units
        while(true) {
            if(units >= 9){
                unitsRemainder = units - 10;
                stringBuilder.append("I".repeat(-unitsRemainder));
                stringBuilder.append("X");
                break;
            } else if (units >= 4) {
                unitsRemainder = units - 5;
                if(unitsRemainder > 0){
                    stringBuilder.append("V");
                    units = unitsRemainder;
                } else{
                    stringBuilder.append("I".repeat(-unitsRemainder));
                    stringBuilder.append("V");
                    break;
                }
            } else {
                 stringBuilder.append("I".repeat(Math.max(0, units)));
                break;
            }
        }
        return stringBuilder.toString();
    }
}
