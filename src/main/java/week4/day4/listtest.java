package week4.day4;

import java.util.ArrayList;

public class listtest {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        int num = 10;
        String str = "hello";
        list.add(num);
        list.add(str);
        System.out.println(list.get(0));
    }
}
