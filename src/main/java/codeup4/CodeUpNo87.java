package codeup4;

import java.util.Scanner;

public class CodeUpNo87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum = sum + i;
            if (sum >= a){
                break;
            }
        }
        System.out.println(sum);
    }
}
