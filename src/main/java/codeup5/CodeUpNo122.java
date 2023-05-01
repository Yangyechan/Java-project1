package codeup5;

import java.util.Scanner;

public class CodeUpNo122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a >= 60){
            System.out.println((a / 60) + " " + a % 60);
        }else System.out.println(0 + " " +a);
    }
}
