import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        StringBuilder stB = new StringBuilder(my_string);
        
        Arrays.sort(indices);
        for(int i : indices) {
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i = indices.length - 1; i >= 0; i--) {
            stB.deleteCharAt(indices[i]);
            System.out.println(stB);
        }
        answer = stB.toString();
        return answer;
    }
}