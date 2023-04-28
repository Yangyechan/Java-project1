package codeup;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUpNo1441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        int temp ;
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a-1; j++) {
                if (b[j] > b[j + 1]) {
                    temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(b));

    }
}
