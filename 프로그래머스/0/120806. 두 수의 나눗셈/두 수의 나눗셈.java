class Solution {
    public int solution(int num1, int num2) {
        double d = num1 / (double)num2;
        System.out.println(d);
        int answer = (int)(d * 1000);
        return answer;
    }
}