package task7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String address = in.nextLine();

        Pattern pattern = Pattern.compile("^([0-9a-fA-F]{2}([:-]|$)){6}$|([0-9a-fA-F]{4}([.]|$)){3}$");
        Matcher matcher = pattern.matcher(address);

        System.out.format("MAC адрес %s: ", address);
        if(matcher.find()) {
            System.out.println("correct");
        } else {
            System.out.println("wrong");

        }
    }
}
