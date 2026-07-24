class Solution {
    public int solution(int n) {
        int answer = 1;
        int fa = 1;
        int c = 1;
        
        while(true) {
            int tmp = 1;
            for(int i = c; i > 0; i--) {
                tmp *= i;
            }
            
            fa = tmp;
            c++;
            if(fa > n) {
                break;
            }
        }
        
        return c - 2;
    }
}