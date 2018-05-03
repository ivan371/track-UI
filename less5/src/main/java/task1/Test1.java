package task1;

import org.junit.*;
import static org.junit.Assert.assertTrue;

import java.util.Locale;

public class Test1 {
    @Test
    public static void test_simple_nums() {
        Task1 task1 = new Task1();
        String res = task1.test1(1, 1, Locale.ENGLISH);
        assert ("equal", res, "oneone");
    }

    @Test
    public static void test_wrong_nums() {
        Task1 task1 = new Task1();
        String res = task1.test1(1, 1, Locale.ENGLISH);
        assert ("equal", res, "one");
    }
}
