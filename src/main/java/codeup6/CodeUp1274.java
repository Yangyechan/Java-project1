package codeup6;

import java.util.Scanner;

public class CodeUp1274 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factors = 0;
        for (int i = 1; i <= num; i++) {
            if(num % i == 0){
                factors++;
            }
        }
        if(factors == 2){
            System.out.println("prime");
        }else {
            System.out.println("not prime");
        }
    }
}
