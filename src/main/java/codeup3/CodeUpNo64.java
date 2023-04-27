package codeup3;

import java.util.Scanner;

public class CodeUpNo64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println((a < b ? a : b) < c ? (a < b ? a : b) : c);
    }
}
