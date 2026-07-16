class Solution {
    public int solution(int slice, int n) {
        int answer = 1;
        
        //피자 조각 2조각 ~ 10조각
        //n명의 사람
        
        while(true) {
            if(answer * slice / n >= 1) break;
            answer++;
        }
        return answer;
    }
}