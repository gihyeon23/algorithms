class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        int n = -1;
        
        while(num > 0) {
            if(num % 10 == k) {
                answer = n;
            }
            num /= 10;
            n++;
        } 
        
        return (answer == 0) ? -1 : n - answer;
    }
}