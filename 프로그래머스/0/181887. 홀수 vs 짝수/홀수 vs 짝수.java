class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int oddAdd = 0;
        int evenAdd = 0;
        
    
        for(int i = 0; i < num_list.length; i+=2) {
            oddAdd += num_list[i];
        }
        for(int i = 1; i < num_list.length; i+=2) {
            evenAdd += num_list[i];
        }
        
        if(oddAdd >= evenAdd) {
            answer = oddAdd;
        } else {
            answer = evenAdd;
        }
   
        
        return answer;
    }
}