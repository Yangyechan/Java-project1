package week1;

public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        user.name = "양예찬";
        user.phoneNumber = "010-****-9702";
        user.age = 26;
        System.out.println(user.name);
        System.out.println(user.phoneNumber);
        System.out.println(user.age);
        System.out.printf("%s님은 성인입니까? %s\n", user.name, user.isAdult());
    }
}
