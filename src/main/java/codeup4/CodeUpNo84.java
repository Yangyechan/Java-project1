package codeup4;

import java.io.*;

public class CodeUpNo84 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] num = br.readLine().split(" ");
        int cnt = 0;
        for (int i = 0; i < Integer.valueOf(num[0]); i++) {
            for (int j = 0; j < Integer.valueOf(num[1]); j++) {
                for (int k = 0; k < Integer.valueOf(num[2]); k++) {
                    bw.write(i + " " + j + " " + k +"\n");
                    cnt++;
                }
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
    }
}
