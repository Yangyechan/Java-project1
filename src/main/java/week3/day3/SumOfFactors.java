package week3.day3;

public class SumOfFactors {
    public static void main(String[] args) {
        int num = 6;
        int answer = 0;
        for (int i = 1; i <= 6; i++) {
            if(num % i == 0){
                answer += i;
            }
        }
        System.out.println(answer);
    }
}
