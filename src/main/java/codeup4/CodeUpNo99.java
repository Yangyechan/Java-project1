package codeup4;

import java.util.Scanner;

public class CodeUpNo99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] map = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        int x = 1, y = 1;
        while (true) {
            if (map[x][y] == 2) {
                map[x][y] = 9;
                break;
            }
            map[x][y] = 9;

            if (map[x][y+1] != 1) {
                y++;
            } else if (map[x+1][y] != 1) {
                x++;
            } else {
                break;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

    }
}
