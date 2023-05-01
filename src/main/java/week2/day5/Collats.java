package week2.day5;

public class Collats {
    public static void main(String[] args) {
        int n = 6;
        Solution sl = new Solution();
        System.out.println(sl.solution(n));
    }
    public static class Solution {
        public int solution(long num) {
            int answer = 0;
            while(num!=1) {
                if(num%2==0) {
                    num /= 2;
                } else {
                    num = 3*num + 1;
                }

                answer++;
                if(answer==500) {
                    answer=-1;
                    break;
                }
            }
            return answer;
        }
    }
}
