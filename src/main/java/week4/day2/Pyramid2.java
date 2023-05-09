package week4.day2;

public class Pyramid2 {
    private String spaceChar = "0";
    private int height = 0;
    public Pyramid2(String spaceChar, int height) {
        this.spaceChar = spaceChar;
        this.height = height;
    }

    public void printPyramid() {
        for (int i = 0; i < height; i++) {
            System.out.printf("%s%s\n", spaceChar.repeat(height - i - 1), "*".repeat(2 * i + 1));
        }
    }
    public static void main(String[] args) {
        Pyramid2 pyramid2 = new Pyramid2(" ", 4);
        pyramid2.printPyramid();
    }

}
