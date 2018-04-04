package task2;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    private static <t> Predicate<t> condition() {
        return x -> x.equals(x.toString());
    }

    private static <t, r> Function<t, r> ifTrue() {
        return x -> (r) x.toString();
    }

    private static <t, r> Function<t, r> ifFalse() {
        return x -> (r) x.getClass();
    }

    private static <t, r> Function<t, r> ternaryOperator(Predicate<t> condition, Function<t, r> ifTrue, Function<t, r> ifFalse) {
        return x -> condition.test(x) ? ifTrue.apply(x) : ifFalse.apply(x);
    }

    public static void main(String[] args) {
        System.out.println(ternaryOperator(condition(), ifTrue(), ifFalse()).apply(5));
        System.out.println(ternaryOperator(condition(), ifTrue(), ifFalse()).apply("a"));
    }
}
