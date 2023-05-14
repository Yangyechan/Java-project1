package week4.day4;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        //list.add("2");
        list.add(3);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        list.remove(0);
        //list.remove(1);
        //list.removeAll(list);
        if(!list.isEmpty()){
            System.out.println("ok");
        }
    }
}
