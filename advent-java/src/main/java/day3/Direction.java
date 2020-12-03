package day3;

public class Direction {
    public final int right;
    public final int down;

    public Direction(int right, int down) {
        this.right = right;
        this.down = down;
    }
    public static Direction of(int right, int down) {
        return new Direction(right, down);
    }
}
