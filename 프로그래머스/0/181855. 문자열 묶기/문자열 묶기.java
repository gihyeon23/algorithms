import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int[] count = new int[strArr.length];
        int answer = 0;
        
        // 문자열 길이 저장
        for (int i = 0; i < strArr.length; i++) {
            count[i] = strArr[i].length();
        }
        
        // 길이 정렬
        Arrays.sort(count);
        
        int bN = count[0];
        int nowCount = 1;
        
        for (int i = 1; i < strArr.length; i++) {
            if (bN == count[i]) {
                nowCount++;
            } else {
                // 지금까지 같은 길이였던 그룹 크기 저장
                if (answer < nowCount) {
                    answer = nowCount;
                }
                
                // 새 그룹 시작
                bN = count[i];
                nowCount = 1;
            }
        }
        
        // 마지막 그룹 처리
        if (answer < nowCount) {
            answer = nowCount;
        }
        
        return answer;
    }
}