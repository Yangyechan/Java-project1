package codeup4;

import java.util.Scanner;

public class CodeUpNo93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[23];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int sum = sc.nextInt();
            num[sum-1] += 1;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
