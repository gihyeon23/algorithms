class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int a = myString.indexOf(pat);
        
        while ( a != -1) {
            a = myString.indexOf(pat, a + 1);
            answer++;  
        }
        
        return answer;
    }
}