package codeup3;

import java.util.Scanner;

public class CodeUpNo67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 0){
            System.out.println("minus");
            if (a % 2 == -1){
                System.out.println("odd");
            } else if (a % 2 == 0) {
                System.out.println("even");
            }
        } else if (a > 0) {
            System.out.println("plus");
            if (a % 2 == 1){
                System.out.println("odd");
            } else if (a % 2 == 0) {
                System.out.println("even");
            }
        }

    }
}
