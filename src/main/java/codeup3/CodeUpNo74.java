package codeup3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUpNo74 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        int b = Integer.parseInt(a);
        while (true){
            System.out.println(b);
            b--;
            if(b == 0){
                break;
            }
        }
    }
}
