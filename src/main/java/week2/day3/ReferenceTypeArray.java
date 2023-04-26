package week2.day3;

public class ReferenceTypeArray {
    public static void main(String[] args) {
        Student[] st = new Student[2];
        st[0] = new Student();
        st[0].name = "양예찬";
        st[0].phoneNumber = "010-0000-0000";
        st[0].age = 26;
        st[1] = new Student();
        st[1].name = "김경록";
        st[1].phoneNumber = "010-0000-0000";
        st[1].age = 37;
    }
}
