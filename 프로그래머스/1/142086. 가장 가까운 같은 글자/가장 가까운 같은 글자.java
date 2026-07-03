class Solution {
    public int[] solution(String s) {

        int[] answer = new int[s.length()];
        String tmp = s.charAt(0) + "";
        answer[0] = -1;
        int far = 0;
        
        //일단 겹치면 -1 넣기 완료
        for(int i = 1; i < s.length(); i++) {
            if(!tmp.contains(s.charAt(i) + "")) {
                tmp += s.charAt(i);
                answer[i] = -1;
            } else {
                for(int j = i - 1; j >= 0; j--) {
                    far++;
                    if(s.charAt(i) == s.charAt(j)) {
                        answer[i] = far;
                        break;
                    }
                }
                far = 0;
            }
            System.out.println();
        }
        return answer;
    }
}