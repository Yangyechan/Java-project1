package week4.day1;

public class SumOfDivisors {
     int sumOfFactors(int num){
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0){
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfDivisors sod = new SumOfDivisors();
        int num = 12;
        System.out.println(sod.sumOfFactors(num));
    }
}
