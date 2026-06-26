class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for(int i = 0; i < queries.length; i++) {
            int h = queries[i][0];
            int t = queries[i][1];
            for(int j = h; j <= t; j++) {
                arr[j]++;
            }
        }
        return arr;
    }
}