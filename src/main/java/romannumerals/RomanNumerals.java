package romannumerals;

import java.util.LinkedHashMap;

public class RomanNumerals {
    public static void main(String[] args) {
        RomanNumerals  romanNumerals = new RomanNumerals();
        for (int i = 999; i < 1000; i++){
            String roman = romanNumerals.convert(i);
            System.out.println("\"" + i + ", '" + roman + "'\",");
        }
    }
    //mas num 3999
    public String convert(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        int units;
        int tens = 0;
        int hundreds = 0;
        int thousands = 0;

        while(true) {
            if (number > 999) {
                thousands = (int) Math.floor(number / 1000);
                number = number - thousands * 100;
                System.out.println("t" + thousands);
            } else if (number > 99) {
                hundreds = (int) Math.floor(number / 100);
                number = number - hundreds * 100;
                System.out.println("h" + hundreds);
            } else if (number > 9) {
                tens = (int) Math.floor(number / 10);
                number = number - tens * 10;
                System.out.println("t" + tens);
            } else {
                units = number;
                System.out.println("u" + units);
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
