package records;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Point)) return false;
        Point that = (Point) o;
        return this.x == that.x && this.y == that.y;
    }

    public int hashCode() {
        return 13 * x + 29 * y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
