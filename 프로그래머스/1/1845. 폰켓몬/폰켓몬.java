import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int answer = nums.length / 2;
        
        for(int i : nums) {
            map.put(i,1);
        }
        
        if(map.size() < nums.length / 2) {
            System.out.print(map.size() + " " + nums.length / 2);
            return map.size();
        }
        
        System.out.print(map);

        return answer;
    }
}