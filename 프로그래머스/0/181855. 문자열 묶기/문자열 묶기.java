import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        
        int[] strLength = new int[31]; //만약 30을 담고 ++해버리면 또 배열 터지니까 걍 하나더
        int answer = 0;
        
        for(int i = 0; i < strArr.length; i++) {
            strLength[strArr[i].length()]++;
        }
        
        Arrays.sort(strLength);
        
        return strLength[30];
    }
}