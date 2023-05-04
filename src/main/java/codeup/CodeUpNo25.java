package codeup;

import java.util.Scanner;

public class CodeUpNo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char []b= a.toCharArray();
        for (int i = 0; i < a.length(); i++) {
            System.out.print("[" + a.charAt(i));
            for (int j = a.length()-1; j > i ; j--) {
                System.out.print("0");
            }
            System.out.println("]");
        }
    }
}
