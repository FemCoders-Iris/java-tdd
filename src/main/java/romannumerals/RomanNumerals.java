package romannumerals;

public class RomanNumerals {
    public static void main(String[] args) {
        RomanNumerals  romanNumerals = new RomanNumerals();
        for (int i = 90; i < 100; i++){
            String roman = romanNumerals.convert(i);
            System.out.println("\"" + i + ", '" + roman + "'\",");
        }
    }
    public String convert(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        int units;
        int tens = 0;
        int hundreds = 0;
        int unitsRemainder, tensRemainder, hundredsRemainder;

        while(true) {
            if (number > 99) {
                hundreds = (int) Math.floor(number / 100);
                number = number - hundreds * 100;
            } else if (number > 9) {
                tens = (int) Math.floor(number / 10);
                number = number - tens * 10;
            } else {
                units = number;
                break;
            }
        }
        //Hundreds
        while(true){
            if(hundreds >= 9) {
                hundredsRemainder = hundreds - 10;
                stringBuilder.append("C".repeat(-hundredsRemainder));
                stringBuilder.append("M");
                break;
            } else if (hundreds >= 4) {
                hundredsRemainder = hundreds - 5;
                if (hundredsRemainder > 0) {
                    stringBuilder.append("D");
                    hundreds = hundredsRemainder;
                } else {
                    stringBuilder.append("C".repeat(-hundredsRemainder));
                    stringBuilder.append("D");
                    break;
                }
            } else {
                stringBuilder.append("C".repeat(Math.max(0, hundreds)));
                break;
            }
        }
        //Tens
        while(true) {
            if(tens >= 9) {
                tensRemainder = tens - 10;
                stringBuilder.append("X".repeat(-tensRemainder));
                stringBuilder.append("C");
                break;
            } else if (tens >= 4) {
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
