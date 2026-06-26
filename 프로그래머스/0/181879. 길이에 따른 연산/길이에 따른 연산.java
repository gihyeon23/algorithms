class Solution {
    public int solution(int[] num_list) {
        int answer1 = 0;
        int answer2 = 1;
        
        if(num_list.length >= 11) {
            for(int i = 0; i < num_list.length; i++) {
                answer1 += num_list[i];
            }
            return answer1;
        } else {
            for(int i = 0; i < num_list.length; i++) {
                answer2 *= num_list[i];
            }
            return answer2;
        }
    }
}