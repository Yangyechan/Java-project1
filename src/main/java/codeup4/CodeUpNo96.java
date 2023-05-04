package codeup4;

import java.util.Scanner;

public class CodeUpNo96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] num = new int[20][20];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int j = 0; j < n; j++) {
                num[a-1][b-1] = 1;
            }
        }
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}
