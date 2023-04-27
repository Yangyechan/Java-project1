package week2.day4;

import java.util.Arrays;

public class TreasureMap {
    public static void main(String[] args) {

        int n = 5;
        int[] arr1 = new int[]{9, 20, 28, 18, 11};
        int[] arr2 = new int[]{30, 1, 21, 17, 28};
        System.out.println(Arrays.toString(Solution.solution(n, arr1, arr2)));

    }

    public static class Solution {
        public static String[] solution(int mapSize, int[] arr1, int[] arr2) {
            String[] answer = new String[mapSize];

            for(int i = 0; i < mapSize; i++) {
                answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]); // ex) answer[1]: "10101"
                answer[i] = answer[i].replace('1', '#'); // ex) answer[1]: "#0#0#"
                answer[i] = answer[i].replace('0', ' '); // ex) answer[1]: "# # #"
            }

            return answer;
        }
    }
}
