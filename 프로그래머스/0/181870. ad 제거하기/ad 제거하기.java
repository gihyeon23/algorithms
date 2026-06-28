class Solution {
    public String[] solution(String[] strArr) {
        int index = 0;
        int count = 0;
        
        for(int i = 0; i < strArr.length; i++) {
            if(!strArr[i].contains("ad")) {
                count++;
            }
        }
        
        String[] answer = new String[count];
        
        for(int i = 0; i < strArr.length; i++) {
            if(!strArr[i].contains("ad")) {
                answer[index] = strArr[i];
                index++;
            }
        }
        return answer;
    }
}