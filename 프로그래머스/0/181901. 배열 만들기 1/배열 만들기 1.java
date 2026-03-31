class Solution {
    public int[] solution(int n, int k) {
        int count = 0;
        int tmp = k;
        for(int i = k; i <= n; i += k) {
            count++;
        }
        int[] answer = new int[count];
        
        for(int i = 0; i < count; i++) {
            answer[i] = k;
            k = k + tmp;
        }
        
        return answer;
    }
}