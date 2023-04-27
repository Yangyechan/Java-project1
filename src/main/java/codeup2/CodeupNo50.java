package codeup2;

import java.util.Scanner;

public class CodeupNo50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            System.out.println(1);
        } else if ((a > b) || (a < b)) {
            System.out.println(0);
        }
    }
}
