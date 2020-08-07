package records;

import org.junit.jupiter.api.Test;

public class PointTest {

    @Test
    public void testPoint() {
        Point point = new Point(5, 10);
        System.out.println(point.getX());
        System.out.println(point.getY());
        System.out.println(point.toString());
        Point point2 = new Point(5, 10);
        System.out.println(point + " equals " + point2 + "? " + point.equals(point2));
    }
}
