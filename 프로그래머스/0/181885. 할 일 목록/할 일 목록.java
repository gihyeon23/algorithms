class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        
        //먼저 false개수를 구하자
        int cF = 0;
        for(int i = 0; i < finished.length; i++) {
            if (finished[i] == false) {
                cF++;
            }
        }
        //이제 false인것들 집어 넣자
        int aI = 0;
        String[] answer = new String[cF];
        for(int i = 0; i < finished.length; i++) {
            if (finished[i] == false) {
                answer[aI] = todo_list[i];
                aI++;
            }
        }
        
        return answer;
    }
}