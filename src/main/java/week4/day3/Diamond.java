package week4.day3;

public class Diamond {
    public static void main(String[] args) {
        int a = 7;
        int pivot = a / 2;

        for (int i = 0; i < pivot; i++) {
            for (int j = 0; j < pivot - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = pivot; i >0 ; i--) {
            for (int j = pivot-i+2; j >0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 2*i-3; j >0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
