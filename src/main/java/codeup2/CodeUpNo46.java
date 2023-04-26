package codeup2;

import java.util.Scanner;

public class CodeUpNo46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float d = (int)(a + b + c);
        System.out.println(a + b + c);
        System.out.printf("%.01f", d/3);
    }
}
