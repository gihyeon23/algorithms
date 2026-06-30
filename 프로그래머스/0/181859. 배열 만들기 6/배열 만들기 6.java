import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        
        for(int i = 0; i < arr.length; ) {
            if(stk.isEmpty()) {
                stk.add(arr[i]);
                i++;
            } else if(stk.get(stk.size() - 1) == arr[i]) {
                stk.remove(stk.size() - 1);
                i++;
            } else {
                stk.add(arr[i]);
                i++;
            }
        }
        
        int[] answer = new int[stk.size()];
        for(int i = 0; i < stk.size(); i++) {
            answer[i] = stk.get(i);
        }
        
        if(stk.isEmpty()) {
            return new int[]{-1};
        }
        
        return answer;
    }
}