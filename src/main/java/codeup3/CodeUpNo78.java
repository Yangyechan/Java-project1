package codeup3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUpNo78 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        int a = Integer.parseInt(st);
        int sum = 0;
        for (int i = 0; i <= a; i++) {
            if (i % 2 == 0){
                sum = sum +i;
            }
        }
        System.out.println(sum);
    }
}
