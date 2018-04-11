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

    @Test

    public void testNegativeOne() {
        testTemplate("1", "2");
    }

    @Test
    public void testNegativeTwo() {
        testTemplate("String1", "String2");
    }

    @Test
    public void testException() {
        try {
            testTemplate(null, "string");
        } catch(NullPointerException e) {
            System.out.println("Null string");
        }
    }
}
