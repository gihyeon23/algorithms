class Solution {
    public int solution(int order) {
        String o = Integer.toString(order);
        int answer = 0;
        
        for(int i = 0; i < o.length(); i++) {
            if( (o.charAt(i)-'0') % 3 == 0 && o.charAt(i)-'0' != 0) {
                answer++;
            }
        }
        
        return answer;
    }
}