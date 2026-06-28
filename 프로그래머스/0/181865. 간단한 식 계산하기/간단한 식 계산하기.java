class Solution {
    public int solution(String binomial) {
        String[] bi = binomial.split(" ");
        int answer = 0;

        int num1 = Integer.parseInt(bi[0]);
        int num2 = Integer.parseInt(bi[2]);
        
        if(bi[1].equals("+")) {
            answer = num1 + num2;
        } else if (bi[1].equals("-")) {
            answer = num1 - num2;
        } else if (bi[1].equals("*")) {
            answer = num1 * num2;
        }
        
        return answer;
    }
}