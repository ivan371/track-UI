package tests;

import org.junit.Test;
import problem2.ThreeNumberCount;

import java.util.Arrays;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
public class ThreeNumberCountTest {

    private void testTemplate(ThreeNumberCount numbers, int count) {
        assertThat(numbers.getThreeNumberCount() + " != " + count,numbers.getThreeNumberCount() , is(count));
    }

    @Test
    public void testPositiveOne() {
        testTemplate(new ThreeNumberCount(new int[]{1, 2, 3, 4, 5}), 1);
    }

    @Test
    public void testPositiveTwo() {
        testTemplate(new ThreeNumberCount(new int[]{333, 33}), 5);
    }

    @Test
    public void testNegativeOne() {
        testTemplate(new ThreeNumberCount(new int[]{}), 1);
    }

    @Test
    public void testNegativeTwo() {
        testTemplate(new ThreeNumberCount(new int[]{300003, 33}), 5);
    }
}
