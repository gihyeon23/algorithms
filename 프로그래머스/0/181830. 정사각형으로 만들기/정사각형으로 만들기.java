class Solution {
    public int[][] solution(int[][] arr) {
        
        int le = 0;
        //길이 구하기
        if(arr.length > arr[0].length) {
            le = arr.length;
        } else {
            le = arr[0].length;
        }
        
        int[][] answer = new int[le][le];
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}