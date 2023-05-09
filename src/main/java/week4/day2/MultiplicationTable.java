package week4.day2;

public class MultiplicationTable {
    public static void multitable(int b){
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", b, i, b*i);
        }
    }
    public static void main(String[] args) {
        int a = 2;
        multitable(a);
    }
}
