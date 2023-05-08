package codeup6;

import java.util.Scanner;

public class CodeUp1671 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        CodeUp1671 cdu = new CodeUp1671();
        System.out.println(cdu.rsp(a,b));
    }
    public String rsp(int a, int b){
        if(a==0 && b == 1) {
            return "win";
        } else if (a == 1 && b == 2) {
            return "win";
        } else if (a == 2 && b == 0) {
            return "win";
        } else if (a == b) {
            return "tie";
        }else {
            return "lose";
        }
    }
}
