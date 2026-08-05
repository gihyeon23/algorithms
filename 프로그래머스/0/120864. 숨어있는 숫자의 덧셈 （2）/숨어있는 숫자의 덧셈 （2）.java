class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-zA-Z]", " ");
        String[] s = my_string.split(" ");
        
        for (String i : s) {
            if (!i.isEmpty()) {         
                answer += Integer.parseInt(i);
            }
        }
        
        return answer;
    }
}