package triangle;

import java.util.ArrayList;
import java.util.List;

public enum TestPoints {
    t1(0, 1, 0, 0, 1, 1), t2(0, 0, 0, 3, 1, 1), t3(0, 0, 2, 0, 1, Math.sqrt(3.0));

    private List<Double> points;

    TestPoints(double x1, double y1, double x2, double y2, double x3, double y3) {
        points = new ArrayList<Double>();
        points.add(x1);
        points.add(y1);
        points.add(x2);
        points.add(y2);
        points.add(x3);
        points.add(y3);
    }

    public List<Double> getPoints() {
        return points;
    }
}
