package codeup6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class CodeUp3108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String C = sc.next();
            String noname = sc.nextLine();
            if(C.equals("I")){
                list.add(noname);
            } else if (C.equals("D")) {
                for (int j = 0; j < list.size(); j++) {
                    if(noname.equals(list.get(j))){
                        list.remove(j);
                    }
                }
            }
        }
        Collections.sort(list);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();
        System.out.println(list.get(n1));
        System.out.println(list.get(n2));
        System.out.println(list.get(n3));
        System.out.println(list.get(n4));
        System.out.println(list.get(n5));
    }
}
