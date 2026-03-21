class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        //분모 
        int mom = denom1 * denom2;
        //분자
        int son = numer1 * denom2 + numer2 * denom1;
        int momTmp = mom;
        int sonTmp = son;
        //최대공약수
        int tmp = 0;
        int max = 0;
        while(true) {
            tmp = mom % son;
            mom = son;
            son = tmp;
            if(son == 0) {
                max = mom;
                break;
            }
        }
        
        answer[0] = sonTmp / max;
        answer[1] = momTmp / max;
        
        return answer;
    }
}