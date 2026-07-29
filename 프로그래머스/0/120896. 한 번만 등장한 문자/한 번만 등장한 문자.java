import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String str = new String(arr);
        System.out.println(str);
        for(int i = 0; i < str.length(); i++) {
            if(!answer.contains(str.charAt(i)+"")) {
                answer += str.charAt(i)+"";
            } else {
                s = s.replace(str.charAt(i)+"","");
            }
        }
        char[] answerC = s.toCharArray();
        Arrays.sort(answerC);
        String tmp = new String(answerC);
        System.out.println(s);
       
        
        return tmp;
    }
}