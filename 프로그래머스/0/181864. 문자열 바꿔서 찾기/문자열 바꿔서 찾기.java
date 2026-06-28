class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        myString = myString.replace("A", ".");
        myString = myString.replace("B", "A");
        myString = myString.replace(".", "B");
        
        
        if(myString.contains(pat)) {
            answer = 1;
        }
        return answer;
    }
}