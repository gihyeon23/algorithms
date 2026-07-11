import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int answer = 0;
        int count = 0;
        int deleteCount = tangerine.length - k;
        
        for(int i : tangerine) {map.put(i,0);}
        
        //개수 파악 -> 이거 뭐 코드 줄 이는걸 인터넷에서 봤는데 모르겠다.
        for(int i = 0; i < tangerine.length; i++) {
            count = map.get(tangerine[i]) + 1;
            map.put(tangerine[i], count);
            count = 0;
        }
        //map에는 개수가 저장되어있다.
        
        // 나의 ㄹㅈㄷ 아이디어 리스트로 정렬하자
        List<Integer> counts = new ArrayList<>(map.values());
        //리스트 내림차순으로 정렬
        counts.sort(Collections.reverseOrder());
        
        int sum = 0;
        
        for (int c : counts) {
            if (sum >= k) break;   // 이미 k개 이상 채웠으면 종료
            sum += c;
            answer++;
        }
        return answer;
    }
}