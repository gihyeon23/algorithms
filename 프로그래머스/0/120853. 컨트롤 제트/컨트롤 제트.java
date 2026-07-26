class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] sp = s.split(" ");
        
        for(int i = 0; i < sp.length; i++) {
            if(sp[i].equals("Z")) {
                answer -= Integer.parseInt(sp[i - 1]);
            } else {
                answer += Integer.parseInt(sp[i]);
            }
        }
        
        return answer;
    }
}