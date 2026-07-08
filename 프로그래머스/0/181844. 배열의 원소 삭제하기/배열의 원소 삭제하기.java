import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        
        for(int i = 0; i < arr.length; i++) {
            //i가 정해질때
            for(int j = 0; j < delete_list.length; j++) {
                if(arr[i] == delete_list[j]){
                      list.remove(Integer.valueOf(arr[i]));
                }
            }
        }
        
        return list;
    }
}