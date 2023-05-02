package codeup4;

import java.util.Scanner;

public class CodeUpNo86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.printf("%.02f MB", (w * h * b)/(1024 * 1024 * 8));
    }
}
