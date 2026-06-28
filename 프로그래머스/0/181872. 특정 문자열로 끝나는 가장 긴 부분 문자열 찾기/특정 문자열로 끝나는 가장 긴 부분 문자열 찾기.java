class Solution {
    public String solution(String myString, String pat) {
        String answer = "";

        int a = myString.indexOf(pat);
        
       while (a != -1) {
           
        if(myString.indexOf(pat, a + 1) == -1) {
            break;
        }
           
        a = myString.indexOf(pat, a + 1);
       }
        
        answer = myString.substring(0, a) + pat;

        return answer;
    }
}