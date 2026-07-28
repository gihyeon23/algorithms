class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) < 91) {
                answer += Character.toLowerCase(my_string.charAt(i));
            } else{
                answer += Character.toUpperCase(my_string.charAt(i));
            }
        }
        
        return answer;
    }
}