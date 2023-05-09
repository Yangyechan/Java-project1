package week4.day2;

public class Pyramid2 {
    public static void main(String[] args) {
        int a = 4;
        Pyramid2 p = new Pyramid2(a);
    }
    Pyramid2(int a){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2*i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
