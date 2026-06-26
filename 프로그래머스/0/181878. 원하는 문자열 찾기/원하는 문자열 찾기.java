class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String my = myString.toLowerCase();
        String pa = pat.toLowerCase();
        
        if(my.equals(pa)) {
            return 1;
        }
        
        for(int i = 0; i < my.length() - pa.length(); i++) {
            if(my.substring(i, i + pat.length()).equals(pa)) {
                answer  = 1;
            }
        }
        
        return answer;
    }
}