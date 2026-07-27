import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 101;
        Arrays.sort(array);
        
        if(array[0] > n) return array[0];
        if(array[array.length-1] < n) return array[array.length-1];
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] > n) {
                answer = array[i]-n < n-array[i-1] ? array[i] : array[i-1];
                break;
            }
        }
        
        return answer;
    }
}