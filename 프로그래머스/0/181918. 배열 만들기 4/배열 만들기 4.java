import java.util.*;
//이문제 처음에 한 실수 i가 인덱스인데 조건에 맞게 인덱스 번호를 늘야하는데 걍 
class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        int i = 0; 
        
        while(i < arr.length){
                if(stk.size() == 0){
                    stk.add(arr[i]);
                    i += 1;
                } else {
                    if(stk.get(stk.size() -1)  < arr[i]) {
                        stk.add(arr[i]);
                        i += 1;
                    } else {
                        stk.remove(stk.size() - 1);
                    }
                }
            }
        return stk;
    }
}