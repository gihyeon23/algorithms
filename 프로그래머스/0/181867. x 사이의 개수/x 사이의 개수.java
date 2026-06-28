class Solution {
    public int[] solution(String myString) {
        
        String[] select = myString.split("x", -1);//!! 매우 중요하다.
        int[] answer = new int[select.length];
        
        for(int i = 0; i < select.length; i++) {
            answer[i] = select[i].length(); 
        }
        return answer;
    }
}