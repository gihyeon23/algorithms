import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String,List<String>> map = new HashMap<>(id_list.length); 
        //길이를 안정해주면 2배씩 늘어남 손실이 크겠지?
        HashMap<String,Integer> countMap = new HashMap<>(id_list.length);
        
        int[] answer = new int[id_list.length];
        
        for(int i = 0; i < id_list.length; i++) {
            map.put(id_list[i], new ArrayList<>());
            countMap.put(id_list[i], 0);
        }
        
        // 신고 정보 저장, 중복 신고 제거
        for (String r : report) {
            String[] se = r.split(" ");
            String reporter = se[0]; // 신고한 사람
            String reported = se[1]; // 신고당한 사람

            if (!map.get(reporter).contains(reported)) {
                map.get(reporter).add(reported);
                int tmp = countMap.get(reported) + 1;
                countMap.put(reported, tmp);
            }
        }
        
        for(int i = 0; i < id_list.length; i++) {
            if(countMap.get(id_list[i]) >= k) { 
                String badBoy = id_list[i];
                //여기 들어오는 놈 frodo랑 neo = id_list[i];
                for(int j = 0; j < id_list.length; j++) {
                    if(map.get(id_list[j]).contains(id_list[i])) {
                        answer[j]++;
                    }
                }
            }
        }
        
        return answer;
    }
}