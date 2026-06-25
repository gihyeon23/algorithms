class Solution {
    public int[] solution(int[] num_list, int n) {
        int length = (num_list.length + n - 1) / n;
        int answerIndex = 0;        
        
        int[] answer = new int[length];
        
        for(int i = 0; i < num_list.length; i+=n) {
            answer[answerIndex] = num_list[i];
            answerIndex++;
        }
        
        return answer;
    }
}