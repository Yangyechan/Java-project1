package codeup3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUpNo77 {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        int a = Integer.parseInt(st);
        int b = 0;
        while (b <= a){
            System.out.println(b);
            b++;
            if (b > a){
                break;
            }
        }
    }
}
