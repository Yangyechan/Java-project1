package codeup2;

import java.util.Scanner;

public class CodeUpNo45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        float c = (int)a;
        float d = (int)b;
        System.out.printf("%.02f",c / d);
    }
}
