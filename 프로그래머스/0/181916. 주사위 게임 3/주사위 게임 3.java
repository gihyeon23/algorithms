import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] diceArray = {a, b, c, d};
        int answer = 0;
        
        Arrays.sort(diceArray);
        //4개가 같을때
        if(diceArray[0] == diceArray[3]) {
            int p = diceArray[0];
            answer = 1111 * p;
        } 
        //3개가 같을때
        else if(diceArray[0] == diceArray[2]) {
            int p = diceArray[0];
            int q = diceArray[3];
            answer = (int)Math.pow(10 * p + q,2);
        } else if(diceArray[1] == diceArray[3]) {
            int p = diceArray[1];
            int q = diceArray[0];
            answer = (int)Math.pow(10 * p + q,2);
        }
        //2개 2개 같을때
        else if((diceArray[0] == diceArray[1]) && (diceArray[2] == diceArray[3])) {
            int p = diceArray[0];
            int q = diceArray[2];
            answer = (p + q) * Math.abs(p - q);
        }
        //2개는 같은데 나머지 2개는 다를때
        else if (diceArray[0] == diceArray[1]) {
            int q = diceArray[2];
            int r = diceArray[3];
            answer = q * r;
        } else if(diceArray[2] == diceArray[3]) {
            int q = diceArray[0];
            int r = diceArray[1];
            answer = q * r;
        } else if (diceArray[1] == diceArray[2]) {
            int q = diceArray[0];
            int r = diceArray[3];
            answer = q * r;
        }   
        //전부 다를때
        else{
            answer = diceArray[0];
        }
        return answer;
    }    
}