import java.util.*;

class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int index = 0;
        
        for(int i = 0; i < k; i++) {
            answer = index;
            index += 2;
            if(index > numbers.length - 1) {
                index = index - numbers.length;
            }
            System.out.println(i + " "+ index);
        }
        
        return numbers[answer];
    }
}