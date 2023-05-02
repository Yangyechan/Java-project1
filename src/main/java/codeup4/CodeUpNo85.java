package codeup4;

import java.util.Scanner;

public class CodeUpNo85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double s = sc.nextDouble();
        System.out.printf("%.01f MB",(h * b * c * s)/(1024.0 * 1024 * 8));
    }
}
