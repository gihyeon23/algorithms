class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        for(int num : arr) {
            answer = arr;
        }
        for(int i = 0; i < queries.length; i++) {
            int f = queries[i][0];
            int s = queries[i][1];
            int tmp = answer[f];
            answer[f] = answer[s];
            answer[s] = tmp;
        }
        
        
        return answer;
    }
}