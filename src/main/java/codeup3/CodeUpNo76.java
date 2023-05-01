package codeup3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUpNo76 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char eng = br.readLine().charAt(0);
        char a = 'a';
        while (eng >= a) {
            System.out.print(a + " ");
            a++;
        }
    }
}
