package week4.day4;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User("김미나","010-1111-1111",80);
        user1.setName("김미미");
        user1.setAge(14);
        System.out.println(user1.getName());

        User user2 = new User("김나미","010-2222-2222",70);
        user2.setName("김나나");
        user2.setAge(37);

        System.out.printf("%s는 어른인지? %b\n", user1.getName(), user1.isAdult());
        System.out.printf("%s는 어른인지? %b\n", user2.getName(), user2.isAdult());
    }

}
