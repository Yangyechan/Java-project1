package codeup3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUpNo75 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        int a = Integer.parseInt(st);
        while (true){
            a--;
            System.out.println(a);
            if (a == 0){
                break;
            }
        }
    }
}
