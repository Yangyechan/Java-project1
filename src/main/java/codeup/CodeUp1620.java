package codeup;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1620 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // 입력된 수
        int sum; // 자릿수 합을 저장할 변수

        while (true) {
            sum = 0;

            // 입력된 수의 각 자릿수를 더해주기
            while (num > 0) {
                sum = sum + num % 10;
                num /= 10;
            }

            // 자릿수 합이 1이면 종료
            if (sum == 1) {
                break;
            } else {
                num = sum; // 새로운 자릿수 합으로 갱신
            }
        }
        System.out.println(sum);
    }
}
