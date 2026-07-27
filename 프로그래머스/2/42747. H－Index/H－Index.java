import java.util.Arrays;
class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int answer = 0;

        for (int i = 0; i <= citations.length; i++) {
            // h 이상 인용된 논문 수 세기
            int count = 0;
            for (int c : citations) {
                if (c >= i) count++;
            }
            // 조건 만족하면 이 h를 후보로 기록
            if (count >= i) answer = i;
            System.out.println(i + " " + count);
        }
        return answer;
    }
}