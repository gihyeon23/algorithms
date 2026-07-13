import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        
        for(int i = 0; i < picture.length; i++){
            answer[i*k] = "";
            for(int j = 0; j < picture[i].length(); j++) {
                for(int g = 0; g < k; g++) {
                    answer[i*k] += picture[i].charAt(j); //이게 한줄
                }
            }
            //같은거 중복 저장
            //i = 0 | 1,2 | i가 1 | 4부터 7전 
            for(int j = i*k + 1; j < i*k + k; j++) {
                answer[j] = answer[i*k];
            }
        }
        
        return answer;
    }
}