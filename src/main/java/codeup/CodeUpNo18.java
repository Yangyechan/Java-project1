package codeup;

import java.util.Scanner;

public class CodeUpNo18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time[] = sc.next().split(":");
        System.out.printf(time[0] +":" +time[1]);
    }
}
