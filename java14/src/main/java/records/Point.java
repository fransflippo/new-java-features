package records;

public record Point(int x, int y) {


    public int x() {
        return 3;
    }

    public int hashCode() {
        return 0;
    }
}
