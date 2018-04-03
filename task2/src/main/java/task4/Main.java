package task4;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        ArrayList<String> students = new ArrayList<String>();
        ArrayList<String> departments = new ArrayList<String>();

        //Create list of students and departments
        for (int i = 0; i < n; ++i) {
            students.add(in.next());
            departments.add(in.next());
        }

        System.out.println("Name ordered list of departments:");
        new HashSet<>(departments).forEach(System.out::println);

        System.out.println("Top the most popular departments:");
        //Create the map with departments and number of students
        Map<String, Long> depFreq = departments.stream().distinct().collect(Collectors.toMap(
                x -> x, x -> departments.stream().filter(y -> y.equals(x)).count()));

        //Print top of the the most popular departments
        depFreq.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3).forEach(x -> System.out.printf("%s\n", x.getKey()));
    }
}
