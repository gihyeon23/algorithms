class Solution {
    public int solution(String my_string) {
        String[] op = my_string.split(" ");
        int answer = Integer.parseInt(op[0]);

        for(int i = 1; i < op.length; i+=2) {
            if(op[i].equals("+")) {
                answer += Integer.parseInt(op[i+1]);
                System.out.println(answer);
            } else {
                answer -= Integer.parseInt(op[i+1]);
                System.out.println(answer);
            }
        }
        
        return answer;
    }
}