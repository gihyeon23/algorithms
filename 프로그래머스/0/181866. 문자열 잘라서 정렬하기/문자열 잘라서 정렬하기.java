import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        Arrays.sort(answer);
        int st = 0;
        
        for(int i = 0; i < answer.length; i++) {
            if(answer[i].equals("")) {
                st++;
            }
        }
        String[] answer1 = Arrays.copyOfRange(answer, st, answer.length);
        
        return answer1;
    }
}