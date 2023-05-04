package codeup4;

import java.util.Scanner;

public class CodeUpNo99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] num = new int[10][10];
        int a = 1;
        int b = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                num[i][j] = sc.nextInt();
            }
        }
        while (true){
            if(num[a][b]==0){
                num[a][b] = 9;
                b++;
            }
            if (num[a][b]==1){
                a++;
                b--;
            }
            if (num[a][b]==2){
                num[a][b]=9;
                break;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

    }
}
