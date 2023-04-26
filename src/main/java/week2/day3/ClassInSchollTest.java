package week2.day3;

public class ClassInSchollTest {
    public static void main(String[] args) {
        ClassInSchool classInSchool = new ClassInSchool();
        classInSchool.no = 1;
        classInSchool.teacher = new Teacher();
        classInSchool.teacher.name = "김경록";
        classInSchool.teacher.age = 37;
        classInSchool.teacher.address = "경기도";

        System.out.println(classInSchool.teacher.name);
        System.out.printf("%d반 선생님의 이름은 %s입니다\n", classInSchool.no, classInSchool.teacher.name);
    }
}
