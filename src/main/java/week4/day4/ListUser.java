package week4.day4;

import java.util.ArrayList;
import java.util.List;

public class ListUser {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        User useryyc = new User("양예찬","010-0000-0000",26);
        users.add(useryyc);
        for (User u: users) {
            System.out.println(u.getAge());
        }
    }
}
