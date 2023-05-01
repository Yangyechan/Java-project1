package codeup6;

import java.util.Scanner;

public class CodeUp1124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("C");
        String[] input2 = input[1].split("H");

        int x = Integer.parseInt(input2[0]);
        int y = Integer.parseInt(input2[1]);
        int sum = 12*x + 1*y;
        System.out.println(sum);
    }
}
