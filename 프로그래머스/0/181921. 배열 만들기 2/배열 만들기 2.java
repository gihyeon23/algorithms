class Solution {
    public int[] solution(int l, int r) {
        int[] ex = {-1};
        int count = 0;
        
        for(int i=l; i <= r; i++) {
                if(isValid(i) == true) count++;
        }
        
        
        int[] answer = new int[count];
        
        if(count == 0){
            return ex;
        } //예외처리
        // if (count == 0) {
        //     return new int[]{-1};
        // }
        int index = 0;
        for(int i=l; i <= r; i++) {
            if(isValid(i) == true) {
                answer[index] = i; 
                index++;
            }
        }
        
        
        
        return answer;
    }

    private boolean isValid(int a) {
        int tmp = a;
        while (a > 0) {
            int digit = a % 10;
            if (digit != 0 && digit != 5) {
                return false;
            }
            a /= 10;
        }
        return true;
    }
}