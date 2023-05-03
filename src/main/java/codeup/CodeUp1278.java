package codeup;

import java.util.Scanner;

public class CodeUp1278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 0;
        while (a > 0){
            a = a/10;
            cnt++;
        }
        System.out.println(cnt);
    }
}
