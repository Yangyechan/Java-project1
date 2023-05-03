package codeup4;

import java.util.Scanner;

public class CodeUpNo89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        int sum = a;
        for (int i = 1; i < n; i++) {
            sum = sum + d;
        }
        System.out.println(sum);
    }
}
