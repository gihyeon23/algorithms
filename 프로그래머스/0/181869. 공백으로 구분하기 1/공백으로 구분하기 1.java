class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        int index = 0;
        int size = 1;
        
        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) == ' ') {
                size++;
            }
        }
        
        answer = new String[size];
        
        answer[index] = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            
            if(my_string.charAt(i) == ' ') {
                index++;
                answer[index] = "";
            } else {
                answer[index] += my_string.charAt(i);
            }
        }
        
        return answer;
    }
}