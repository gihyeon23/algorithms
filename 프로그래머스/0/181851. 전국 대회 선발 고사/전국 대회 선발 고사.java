import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
 
        int answer = 0;
        
        for(int i = 0; i < attendance.length; i++) {
            if(!attendance[i]) {
                rank[i] = Integer.MAX_VALUE; 
            }
        }
        
        int x = 10000;
        
        for(int i = 0; i < 3; i++) { //1등부터 3등까지
            
            int min = Integer.MAX_VALUE;
            int grade = 0;
            //1등
            for(int j = 0; j < rank.length; j++) {
                if(rank[j] < min) {
                    min = rank[j];
                    grade = j;
                    System.out.println(min + " " + grade);
                }
            }
            answer += x * grade;
            x = x / 100;
            rank[grade] = Integer.MAX_VALUE;
            System.out.println("-----");
        }
        
        return answer;
    }
}