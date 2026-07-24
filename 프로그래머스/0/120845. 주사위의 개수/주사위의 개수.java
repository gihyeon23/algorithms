class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int bu = 1;
        
        for(int i = 0; i < box.length; i++) {
            bu *= box[i] / n;
        }
        
        return bu;
    }
}