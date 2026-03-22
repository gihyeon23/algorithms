class Solution {
    public int[] solution(int[] num_list) {
        int la = num_list.length;
        
        int[] answer = new int[la + 1];
        
        
        for(int i = 0; i < la; i++) {
            answer[i] = num_list[i];
        }
        if(num_list[la-1] > num_list[la-2]) {
            answer[la] = num_list[la-1] - num_list[la-2];
        } else {
            answer[la] = num_list[la-1] * 2;
        }
         
        return answer;
    }
}