class Solution {
    public String[] solution(String my_string) {

        String[] tmp = my_string.trim().split(" ");
        String[] answer = {};
        int count = 0;
        int index = 0;
        
        for(int i = 0; i < tmp.length; i++) {
            if(!tmp[i].equals("")) {
                count++;
            }
        }
        answer = new String[count];
        
        for(int i = 0; i < tmp.length; i++) {
            if(!tmp[i].equals("")) {
                answer[index] = tmp[i];
                index++;
            }
        }
        
        return answer;
    }
}