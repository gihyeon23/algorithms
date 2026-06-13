class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;

        //인덱스뒤에 1이 올경우
        for(int i = idx; i < arr.length; i++) {
            System.out.print(i + " ,");
            
            //인덱스가 일치할때
            if (arr[i] == 1) {
                answer = i;
                break;
            }
            
            if(i + 1  == arr.length) {
                answer = -1;
                break;
            }
        }   
        
        return answer;
    }
}