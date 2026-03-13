class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
    
        int len = s + overwrite_string.length();
        String tmp2 = my_string.substring(0, s);
        
        String tmp = my_string.substring(s,len);
        tmp = overwrite_string;
        
        String na = my_string.substring(len,my_string.length());
       
        answer = tmp2 + tmp + na;
        return answer;
    }
}