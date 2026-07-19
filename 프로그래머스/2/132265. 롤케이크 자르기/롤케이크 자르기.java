import java.util.*;

class Solution {
    public int solution(int[] topping) {
        //문제의 핵심 이미 있는 값을 넣어두고 제거
        HashMap<Integer,Integer> b1 = new HashMap<>();
        HashMap<Integer,Integer> b2 = new HashMap<>();
        int answer = 0;
        
        for(int i : topping) {
            b1.put(i, b1.getOrDefault(i,0) + 1);
        }

        for(int i : topping) {
            b2.put(i, b2.getOrDefault(i,0) + 1);
            
            if(b1.get(i) == 1) {
                System.out.println(b1.get(i));
                b1.remove(i);
            } else {
                b1.put(i, b1.get(i) - 1);
            }
            
            if(b1.size() == b2.size()) {
                answer++;
            }
        }
        
        System.out.print(b1);
        
        return answer;
    }
}