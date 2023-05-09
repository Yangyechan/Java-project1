package week4.day2;

public class InvertedPyramid {
    public static void main(String[] args) {
        int a = 4;
        //InvertedPyramid p = new InvertedPyramid();
        for (int i = a; i > 0; i--) {
            for (int j = a-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = i*2-1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
