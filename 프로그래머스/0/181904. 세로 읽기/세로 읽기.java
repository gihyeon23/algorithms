class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        char[][] arr = new char[my_string.length() / m][m];
         int k = 0;
        //2차원 배열에 값 저장 
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = my_string.charAt(k);
                k++;
            }
        }
        
        for(int i = 0; i < my_string.length() / m; i++) {
            answer += arr[i][c - 1];
        }
        
        return  answer;
    }
}