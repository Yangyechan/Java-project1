package codeup4;

import java.util.Scanner;

public class CodeUpNo94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[1000];
        int k = n;
        for (int i = 0; i < n; i++) {
            int sum = sc.nextInt();
            a[k-1] = sum;
            k--;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
