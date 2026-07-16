class Solution {
    public int solution(int n) {
        int answer = 1;
        
        //6조각 * answer = 10
        
        while(answer * 6 % n != 0) {
            answer++;
        }
        
        return answer;
    }
}