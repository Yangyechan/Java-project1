package codeup4;

import java.util.Scanner;

public class CodeUpNo95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sum = new int[n];
        int temp ;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sum[i] = num;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if (sum[j] > sum[j+1]){
                    temp = sum[j];
                    sum[j] = sum[j+1];
                    sum[j+1] = temp;
                }
            }
        }
        System.out.println(sum[0]);
    }
}
