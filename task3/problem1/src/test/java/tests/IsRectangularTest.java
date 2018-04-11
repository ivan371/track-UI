package tests;

import org.junit.Test;
import triangle.TestPoints;
import triangle.Triangle;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsRectangularTest {
    @Test
    public void testOneIsIsosceles() {
        Triangle triangle = new Triangle((ArrayList<Double>) TestPoints.t1.getPoints());
        assertTrue("rectangular triangle", triangle.isRectangular());
    }

    @Test
    public void testTwoIsIsosceles() {
        Triangle triangle = new Triangle((ArrayList<Double>) TestPoints.t2.getPoints());
        assertFalse("non rectangular triangle", triangle.isRectangular());
    }

    @Test
    public void testThreeIsIsosceles() {
        Triangle triangle = new Triangle((ArrayList<Double>) TestPoints.t3.getPoints());
        assertFalse("non rectangular triangle", triangle.isRectangular());
    }
}
