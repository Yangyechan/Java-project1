package codeup4;

import java.util.Scanner;

public class CodeUp1098OOP {
    int[][] pan;
    CodeUp1098OOP(int w, int h){
        this.pan = new int[w][h];
    }
    public void setbeam(int l, int d, int x, int y){
        if (d == 0){
            for (int j = 0; j < l; j++) {
                pan[x-1][y-1+j]=1;
            }
        } else if (d == 1) {
            for (int k = 0; k < l; k++) {
                pan[x-1+k][y-1]=1;
            }
        }
    }
    public void print(){
        for (int i = 0; i < pan.length; i++) {
            for (int j = 0; j < pan.length; j++) {
                System.out.print(pan[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        CodeUp1098OOP cu = new CodeUp1098OOP(w, h);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            cu.setbeam(l,d,x,y);
        }
        cu.print();

    }
}
