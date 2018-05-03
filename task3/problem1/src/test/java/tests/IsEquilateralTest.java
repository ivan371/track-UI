package tests;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import triangle.TestPoints;
import triangle.Triangle;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;

public class IsEquilateralTest {
    @Category(IsEquilateralTest.class)
    @Test
    public void testOneEquilateral() {
        Triangle triangle = new Triangle((ArrayList<Double>) TestPoints.t1.getPoints());
        assertFalse("equilateral triangle", triangle.isEquilateral());
    }

    @Category(IsEquilateralTest.class)
    @Test
    public void testTwoEquilateral() {
        Triangle triangle = new Triangle((ArrayList<Double>) TestPoints.t2.getPoints());
        assertFalse("equilateral triangle", triangle.isEquilateral());
    }

    @Category(IsEquilateralTest.class)
    @Test
    public void testThreeEquilateral() {
        Triangle triangle = new Triangle((ArrayList<Double>) TestPoints.t3.getPoints());
        assertTrue("Non equilateral triangle", triangle.isEquilateral());
    }
}
