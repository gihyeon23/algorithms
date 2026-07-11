import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);
        
        String tmp = phone_book[0];
        
        for(int i = 1; i < phone_book.length; i++) {
            if(phone_book[i].startsWith(tmp)) {
                answer = false;
                System.out.print("나 접두어야~~");
            }
            tmp = phone_book[i];
        }
        
        return answer;
    }
}