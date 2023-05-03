package programmmers;

public class Queries2 {
    public static void main(String[] args) {

    }
    class Solution {
        public int[] solution(int[] arr, int[][] queries) {
            int[] result = new int[queries.length];
            int[] answer = result;
            int[][] temp = queries;
            int s = 0;
            int e = 0;
            int k = 0;
            int t = 0;
            for (int i = 0; i < queries.length; i++) {
                for (int j = 0; j < queries.length; j++) {
                    queries[i][0] = s;
                    queries[i][1] = e;
                    queries[i][2] = k;
                    if(arr[j] >= arr[s] && arr[j] <= arr[e]){
                        if(k < arr[j]){
                            result[t] = arr[j];
                        }
                    }
                }
            }
            return answer; // 미제
        }
    }
}
