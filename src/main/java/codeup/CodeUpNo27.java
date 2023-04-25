package codeup;

import java.util.Scanner;

public class CodeUpNo27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date [] = sc.next().split("[.]");
        int a = Integer.parseInt(date[0]);
        int b = Integer.parseInt(date[1]);
        int c = Integer.parseInt(date[2]);
        System.out.printf("%02d-%02d-%04d",c ,b, a);
    }
}
