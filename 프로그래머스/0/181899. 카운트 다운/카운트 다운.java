class Solution {
    public int[] solution(int start_num, int end_num) {
        
        int[] answer = new int[start_num - end_num + 1];
        int tmp = start_num;
        
        for(int i = 0; i < start_num ; i++) {
            answer[i] = tmp;
            tmp--;
            if(tmp == (end_num - 1)) break;
        }
        
        return answer;
    }
}