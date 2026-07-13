class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int num = 1;
        int rS = 0;
        int rF = n - 1; 
        int sS = 0;  
        int sF = n - 1; 

        while (num <= n * n) {
            // 왼쪽 -> 오른쪽
            for (int i = sS; i <= sF; i++) {
                answer[rS][i] = num++;
            }
            rS++; // 세로는 증가

            // 위쪽 -> 아래쪽
            for (int i = rS; i <= rF; i++) {
                answer[i][sF] = num++;
            }
            sF--; // 가소는 감소

            // 오른쪽 -> 왼쪽
            for (int i = sF; i >= sS; i--) {
                answer[rF][i] = num++;
            }
            rF--; // 가로는 감소

            // 아래쪽 -> 위쪽
            for (int i = rF; i >= rS; i--) {
                answer[i][sS] = num++;
            }
            sS++; //세로는 증가
        }

        return answer;
    }
}
