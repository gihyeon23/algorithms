class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int max = 0;
        int maxIndex = 0;
        int l = 1;
        
        while(l != answer.length + 1) {
            for(int i = 0; i < emergency.length; i++){
                if(emergency[i] > max) {
                    max = emergency[i];
                    maxIndex = i;
                }
            }
            max = 0;
            answer[maxIndex] = l;
            l++;
            emergency[maxIndex] = 0;
            maxIndex = 0;
        }
        
        return answer;
    }
}