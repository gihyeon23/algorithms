import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int le = 0; 
        int index = 0;
        
        for(int i = 0; i < arr.length; i++) {
            le += arr[i];
        }
        answer = new int[le];
        
        for(int i = 0; i < arr.length; i++) { //arr[0] : 5
            for(int j = 0; j < arr[i]; j++) {
                answer[j + index] = arr[i];
            }
            index += arr[i];
        }
        
        return answer;
    }
}