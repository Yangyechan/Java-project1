package codeup3;

import java.io.IOException;
import java.util.Scanner;

public class CodeUpNo73 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            if (a == 0){
                break;
            }
            System.out.println(a);
        }
    }
}
