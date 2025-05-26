package romannumerals;

import java.util.InputMismatchException;
import java.util.LinkedHashMap;

public class RomanNumerals {

    public String convert(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        int units;
        int tens = 0;
        int hundreds = 0;
        int thousands = 0;

        if(0 > number  || number > 3999){
            throw new InputMismatchException("This roman number doesn't exist");
        }

        while(true) {
            if (number > 999) {
                thousands = (int) Math.floor(number / 1000);
                number = number - thousands * 1000;
            } else if (number > 99) {
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

        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(6, thousands);
        linkedHashMap.put(4, hundreds);
        linkedHashMap.put(2, tens);
        linkedHashMap.put(0, units);

        String[] romanLetters = {"I", "V", "X", "L", "C", "D", "M"};

        linkedHashMap.forEach((letter, quantity) -> {
            while(true) {
                System.out.println(quantity + " " + letter);
                if (quantity >= 9) {
                    quantity -= 10;
                    stringBuilder.append(romanLetters[letter].repeat(-quantity));
                    stringBuilder.append(romanLetters[letter + 2]);
                    break;
                } else if (quantity >= 4) {
                    quantity -= 5;
                    if (quantity > 0) {
                        stringBuilder.append(romanLetters[letter + 1]);
                    } else {
                        stringBuilder.append(romanLetters[letter].repeat(-quantity));
                        stringBuilder.append(romanLetters[letter + 1]);
                        break;
                    }
                } else {
                    stringBuilder.append(romanLetters[letter].repeat(Math.max(0, quantity)));
                    break;
                }
            }
        });
        return stringBuilder.toString();
    }
}
