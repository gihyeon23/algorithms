import java.util.*;
class Solution {
    public long solution(long n) {
        String answer = "";
        String s = String.valueOf(n);
        String[] sB =  s.split("");
        
        Arrays.sort(sB,Collections.reverseOrder());
        for(String sisi : sB) {
            answer += sisi;
        }
        return Long.parseLong(answer);
    }
}