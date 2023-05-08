package week4.day1;

public class UserFactoryTest {
    public static void main(String[] args) {
        UserFactory userFactory = new UserFactory();
        //userFactory.getAdultUser().age = 34;
        User user2 = userFactory.getAdultUser();
        User user3 = new User();
        user3.age = 20;
        System.out.println(user2.age);
        System.out.println(user3.age);
        System.out.println(userFactory.getAdultUser());
    }
}
