class Solution {
    public String solution(String n_str) {
        String answer = "";
        int index = 0;
        
        if(n_str.charAt(0) != '0') {
            return n_str;
        }
        
        for(int i = 0; i < n_str.length(); i++) {
            if(n_str.charAt(i) != '0') {
                index = i;
                break;
            }
        }
        
        if(index == 0) {
            return "";
        }
        
        return n_str.substring(index, n_str.length());
    }
}