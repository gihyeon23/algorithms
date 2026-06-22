class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int h1 = intervals[0][0];
        int t1 = intervals[0][1];
        int h2 = intervals[1][0];
        int t2 = intervals[1][1];
        
        int answerLength = (t1 - h1 + 1) + (t2 - h2 + 1);
        
        int[] answer = new int[answerLength];
            
        for (int i = h1; i <= t1; i++) {
            answer[i - h1] = arr[i];
        }
        for (int i = h2; i <= t2; i++) {
            answer[i - h2 + t1 - h1 + 1] = arr[i];
        }
        return answer;
    }
}