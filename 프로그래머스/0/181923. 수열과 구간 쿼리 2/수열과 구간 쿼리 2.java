class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int s = 0;
        int e = 0;
        int k = 0;
        for(int i = 0; i < queries.length; i++) {
            s = queries[i][0];
            e = queries[i][1];
            k = queries[i][2];
            
            int min = -1;
            
            for(int j = s; j <= e; j++) {
               if(arr[j] > k) {
                    if(min > arr[j] || min == -1) {
                        min = arr[j]; 
                        }
               }  
            }
            answer[i] = min;
        }
        return answer;
    }
}