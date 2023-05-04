package codeup4;

import java.util.Scanner;

public class CodeUp98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int[][] num = new int[w][h];

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (d == 0){
                for (int j = 0; j < l; j++) {
                    num[x-1][y-1+j] = 1;
                }
            } else if (d == 1) {
                for (int k = 0; k < l; k++) {
                    num[x-1+k][y-1] = 1;
                }
            }

        }
        for (int t = 0; t < num.length; t++) {
            for (int g = 0; g < num.length; g++) {
                System.out.print(num[t][g] + " ");
            }
            System.out.println();
        }
    }
}
