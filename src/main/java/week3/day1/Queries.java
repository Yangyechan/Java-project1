package week3.day1;

public class Queries {
    class Solution {
        public int[] solution(int[] arr, int[][] queries) {
            int[] answer = arr;
            int t = 0;
            int temp1;
            int temp2;
            for (int i = 0; i < queries.length; i++) {
                temp1 = queries[i][0];
                temp2 = queries[i][1];
                t = arr[temp1];
                arr[temp1] = arr[temp2];
                arr[temp2] = t;
            }
            return answer;
        }
    }
}
