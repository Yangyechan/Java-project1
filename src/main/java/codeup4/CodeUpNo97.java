package codeup4;

import java.util.Scanner;

public class CodeUpNo97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] num = new int[19][19];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                num[i][j] = sc.nextInt();
            }
        }
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            for (int j = 0; j < num.length; j++) {
                if (num[x-1][j] == 0){
                    num[x-1][j] = 1;
                }else {
                    num[x-1][j] = 0;
                }
            }
            int y = sc.nextInt();
            for (int k = 0; k < num.length; k++) {
                if (num[k][y-1] == 0){
                    num[k][y-1] = 1;
                }else {
                    num[k][y-1] = 0;
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                System.out.print(num[i][j] +" ");
            }
            System.out.println();
        }

    }
}
