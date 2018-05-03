package tests;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import triangle.TestPoints;
import triangle.Triangle;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class IsIsoscelesTest {
    @Category(IsIsoscelesTest.class)
    @Test
    public void testOneIsIsosceles() {
        Triangle triangle = new Triangle((ArrayList<Double>) TestPoints.t1.getPoints());
        assertTrue("isosceles triangle", triangle.isIsosceles());
    }

    @Category(IsIsoscelesTest.class)
    @Test
    public void testTwoIsIsosceles() {
        Triangle triangle = new Triangle((ArrayList<Double>) TestPoints.t2.getPoints());
        assertFalse("non isosceles triangle", triangle.isIsosceles());
    }

    @Category(IsIsoscelesTest.class)
    @Test
    public void testThreeIsIsosceles() {
        Triangle triangle = new Triangle((ArrayList<Double>) TestPoints.t3.getPoints());
        assertTrue("isosceles triangle", triangle.isIsosceles());
    }
}
