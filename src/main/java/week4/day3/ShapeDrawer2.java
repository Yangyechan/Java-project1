package week4.day3;

public abstract class ShapeDrawer2 {
    public void printShape(int height) {
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(height, i));
        }
    }

    public abstract String makeALine(int h, int i);
}
