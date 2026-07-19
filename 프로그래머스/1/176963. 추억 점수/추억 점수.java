import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> map = new HashMap<>(name.length);
        int[] answer = new int[photo.length];
        //초기화 <- 빨리빨리 찾아 쓸 수 있음
        for(int i = 0; i < name.length; i++) {map.put(name[i], yearning[i]); }
        
        for(int i = 0; i < photo.length; i++) {
            for(int j = 0; j < photo[i].length; j++) {
                if(map.get(photo[i][j]) != null) {
                    answer[i] += map.get(photo[i][j]);
                }

            }
        }
        
        return answer;
    }
}