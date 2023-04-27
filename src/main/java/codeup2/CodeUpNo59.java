package codeup2;

import java.util.Scanner;

public class CodeUpNo59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = ~a; // 비트 반전 연산자
        System.out.println(b);
    }
}
