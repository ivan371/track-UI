package task1;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);

        //predicate, consumer and lambda-function
        Predicate<Integer> isEven = x -> x % 2 == 0;
        Consumer<Integer> printNumber = x -> System.out.printf("%d ", x);
        Function<Integer, Integer> multiNumber = x -> (isEven.test(x) ? x * 3 : x * 5);

        int n = in.nextInt();

        for (int i = 0; i < n; ++i) {
            numbers.add(in.nextInt());
        }

        IntStream intStream = IntStream.range(0, numbers.size());


        //Create map
        HashMap<Integer, Integer> map = new HashMap<>(intStream.boxed().collect(Collectors.toMap(i -> i, multiNumber)));

        ArrayList<Integer> changedNumbers = new ArrayList<Integer>(map.values());

        //Print numbers
        changedNumbers.stream().forEach(printNumber);
    }
}
