package week3.day3;

public class IsPrime {
    public static void main(String[] args) {
        int num = 2;
        int factors = 0;
        for (int i = 1; i <= num; i++) {
            if(num % i == 0){
                factors++;
            }
        }
        if(factors == 2){
            System.out.println("factors:" + factors);
            System.out.println(num + "은 소수입니다.");
        }else {
            System.out.println("factors:" + factors);
            System.out.println(num + "은 소수가 아닙니다");
        }
    }
}


