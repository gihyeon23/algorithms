class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        int start = 0; //지금은 0
        int end = arr.length - 1; //지금은 5
        
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                // 짝수 인덱스: query[i]번 인덱스 뒤를 자름
                end = start + query[i];
            } else {
                // 홀수 인덱스: query[i]번 인덱스 앞을 자름
                start = start + query[i];
            }
        }
        answer = new int[end - start + 1];
        for(int i = start; i <= end; i++) {
            answer[i - start] = arr[i];
        }
        
        return answer;
    }
}