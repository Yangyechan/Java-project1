package codeup3;

import java.util.Scanner;

public class CodeUpNo79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            if(a[i].equals("q")){
                break;
            }
        }
    }
}
