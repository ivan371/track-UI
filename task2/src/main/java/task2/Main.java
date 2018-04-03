package task2;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        //example of predicate and function
        Predicate<Integer> condition = x -> x % 2 == 0;
        Function<Integer, Integer> ifTrue = x -> --x;
        Function<Integer, Integer> ifFalse = x -> ++x;

        //out ternary Operator
        Function<Integer, Integer> ternaryOperator = x -> condition.test(x) ? ifTrue.apply(x) : ifFalse.apply(x);

        System.out.println(ternaryOperator.apply(5));
        System.out.println(ternaryOperator.apply(6));
    }
}
