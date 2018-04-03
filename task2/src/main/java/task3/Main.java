package task3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char letter = in.next().charAt(0);

        //We split string to words
        String[] words = str.split("\\s+");

        //Create array of filtering words
        Arrays.stream(words).filter(x -> x.charAt(0) == letter).filter(x -> x.length() < 5)
                .forEach(x -> System.out.printf("%s: %d\n", x, x.length()));
    }
}
