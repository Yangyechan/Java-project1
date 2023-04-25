package codeup;

import java.util.Scanner;

public class CodeUpNo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num[]= sc.next().split("-");
        int a = Integer.parseInt(num[0]);
        int b = Integer.parseInt(num[1]);
        System.out.printf("%06d%07d", a, b);
    }
}
