import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        int num = 2;
        while (n > 1) {
            if (n % num == 0) {
                // 마지막에 넣은 소수와 다를 때만 추가 → 중복 제거
                if (list.isEmpty() || list.get(list.size() - 1) != num) {
                    list.add(num);
                }
                n /= num;
            } else {
                num++;
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) answer[i] = list.get(i);
        return answer;
    }
}