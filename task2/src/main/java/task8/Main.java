package task8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String date = in.nextLine();
        String template = in.nextLine();

        String regex = '^' + template + '$';
        regex = regex.replaceAll("[DMYdmyДМГдмг]", "\\\\d");

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);

        if(!matcher.find()) {
            System.out.printf("Date %s correspond to input template %s", date, template);
        } else {
            System.out.printf("Date %s don't correspond to input template %s", date, template);
        }
    }
}
