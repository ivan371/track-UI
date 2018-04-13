package tests;

import org.junit.Test;
import problem4.StringPermutation;

import static org.hamcrest.MatcherAssert.assertThat;


public class StringPermutationTest {
    private void testTemplate(String firstString, String secondString) {
        assertThat(firstString + " not permutate with " + secondString,
                StringPermutation.stringToCharList(firstString).equals(StringPermutation.stringToCharList(secondString)));
    }

    @Test
    public void testPositiveOne() {
        testTemplate("string1", "stirng1");
    }

    @Test
    public void testPositiveTwo() {
        testTemplate("__123 ", "123_ _");
    }

    @Test(expected = NullPointerException.class)
    public void testNegativeOne() {
        testTemplate(null, "2");
    }

    @Test(expected = NullPointerException.class)
    public void testNegativeTwo() {
        testTemplate("String1", null);
    }
}
