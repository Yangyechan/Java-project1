package codeup2;

import java.util.Scanner;

public class CodeUpNo51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ((b > a) || (b == a)) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
