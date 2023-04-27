package codeup2;

import java.util.Scanner;

public class CodeUpNo48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int total = 1;
        for (int i = 1; i <= b; i++) {
            total = 2*total;
        }
        System.out.println(a*total);
    }
}
