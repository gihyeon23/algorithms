class Solution {
    public int solution(String number) {
        int answer = 0;
        int[] num = new int[number.length()];
        int rM = 0;
        
        for(int i=0; i < number.length(); i++) {
            num[i] = number.charAt(i);
            rM += num[i] - '0';
        }
        
        answer = rM % 9;
        return answer;
    }
}