package week4.day1;

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 1; j < a-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i*2+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------");

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*

0000*000
000***00
00*****0
0*******

*/
