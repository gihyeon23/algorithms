class Solution {
    public String[] solution(String[] names) {
        int le = (names.length + 4) / 5;

        String[] answer = new String [le];
        int aI = 0;
        
        for (int i = 0; i < names.length; i+=5) {
            answer[aI] = names[i];
            aI++;
        }
        
        return answer;
    }
}