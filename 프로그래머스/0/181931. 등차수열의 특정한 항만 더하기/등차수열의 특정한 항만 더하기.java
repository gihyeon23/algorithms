class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int tmp = 0;
        
        for(int i = 0; i < included.length; i++) {
            if(included[i] == true) {
                tmp += a;
            }
            a += d;
        }
        return tmp;
    }
}