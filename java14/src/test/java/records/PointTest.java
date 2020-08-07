package records;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

public class PointTest {

    @Test
    public void testPoint() {
        Point point = new Point(50, 100);
        System.out.println("(" + point.x() + ", " + point.y() + ")");
        System.out.println(point.toString());
    }

    @Test
    public void testPointEqualsHashcode() {
        Point point1 = new Point(50, 100);
        Point point2 = new Point(50, 100);
        Point point3 = new Point(100, 50);
        var set = new HashSet<Point>();
        set.add(point1);
        set.add(point2);
        set.add(point3);
        System.out.println(set);
    }
}
