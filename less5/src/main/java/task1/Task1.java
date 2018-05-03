package task1;

import java.util.ArrayList;
import java.util.Locale;

public class Task1 {
    public String test1(int num1, int num2, Locale lang) {
        ArrayList<String> russianNumbers = new ArrayList<String>();
        ArrayList<String> englishNumbers = new ArrayList<String>();

        russianNumbers.add("ноль");
        russianNumbers.add("один");
        russianNumbers.add("два");
        russianNumbers.add("три");
        russianNumbers.add("четыре");
        russianNumbers.add("пять");
        russianNumbers.add("шесть");
        russianNumbers.add("семь");
        russianNumbers.add("восемь");
        russianNumbers.add("девять");

        englishNumbers.add("zero");
        englishNumbers.add("one");
        englishNumbers.add("two");
        englishNumbers.add("three");
        englishNumbers.add("four");
        englishNumbers.add("five");
        englishNumbers.add("six");
        englishNumbers.add("seven");
        englishNumbers.add("eight");
        englishNumbers.add("nine");
        englishNumbers.add("ten");
        if(num1 != num2) {
            if(lang == Locale.ENGLISH) {
                return englishNumbers.get(Math.max(num1, num2));
            }
        }
        else {
            return englishNumbers.get(num1) + englishNumbers.get(num2);
        }
        return null;
    }

    public void test2(char letter, ArrayList<String> list) {
        if (list.size() == 0) {
            System.out.println("ERROR");
        }
        for (int i = 0; i < list.size(); i++) {
            if(letter == list.get(i).charAt(0) || letter == list.get(i).charAt(list.get(i).length() - 1)) {
                System.out.println(list.get(i));
            }
        }
    }
}
