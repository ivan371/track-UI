package triangle;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
    private double distanceFirstSecond;
    private double distanceSecondThird;
    private double distanceThirdFirst;
    private double[] distances;

    public Triangle(ArrayList<Double> points) {
        Point first = new Point(points.get(0), points.get(1));
        Point second = new Point(points.get(2), points.get(3));
        Point third = new Point(points.get(4), points.get(5));
        distances = new double[]{getDistance(first, second), getDistance(second, third), getDistance(third, first)};
    }

    private boolean checkPythagoras(double a, double b, double c) {
        return Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2);
    }

    private double getDistance(Point a, Point b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    private boolean getDifference(double a, double b) {
        return Math.abs(a - b) < 0.00001;
    }

    public boolean isEquilateral() {
        return getDifference(distances[0], distances[1]) && getDifference(distances[1], distances[2]);
    }

    public boolean isIsosceles() {
        return getDifference(distances[0], distances[1]) ||
                getDifference(distances[1], distances[2]) ||
                getDifference(distances[2], distances[0]);
    }

    public boolean isRectangular() {
        return checkPythagoras(distances[0], distances[1], distances[2])||
                checkPythagoras(distances[2], distances[0], distances[1]) ||
                checkPythagoras(distances[1], distances[2], distances[0]);
    }
}
