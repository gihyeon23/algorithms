import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>(); //index 길이
        int[] answer = {};
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                list.add(i);
            }
        }
        
       if(list.size() == 0) {
           answer = new int[1];
           answer[0] = -1;
       } else {
           int head = list.get(0);
           int tail = list.get(list.size() - 1);
           answer = new int[tail - head + 1];
           
           for(int i = head; i <= tail; i++) {
               answer[i - head] = arr[i];
           }
       }
        
        return answer;
    }
}