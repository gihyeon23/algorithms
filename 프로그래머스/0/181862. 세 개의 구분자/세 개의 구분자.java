class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        String[] answerLast = {};
        int count = 0;
        int index = 0;

        myStr = myStr.replace("a", " ").replace("b", " ").replace("c", " ");
        
        myStr = myStr.trim();
        answer = myStr.split(" ");
        
        if(answer[0].equals("")) {
            answer[0] = "EMPTY";
        }
        
        for(int i = 0; i < answer.length; i++) {
            if(!answer[i].equals("")) {
                count++;
            }
        }
        System.out.print(count);
        
        answerLast = new String[count];
        for(int i = 0; i < answer.length; i++) {
            if(!answer[i].equals("")) {
                answerLast[index] = answer[i];
                index++;
            }
        }
        
        
        return answerLast;
    }
}