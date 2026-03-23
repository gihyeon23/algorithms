class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        for(int j=0; j < queries.length; j++) {
            int s = queries[j][0];
            int e = queries[j][1];
            int k = queries[j][2];
            for(int i = s; i <= e; i++) {
                if(i % k == 0) {
                    arr[i] += 1;
                    System.out.print(arr[i]);
                }
            }
            System.out.println();
        }
        
        return arr;
    }
}