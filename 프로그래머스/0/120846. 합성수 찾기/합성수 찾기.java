class Solution {
    public int solution(int n) {
        int answer = 0;
        int su = 0;
        int c = 0;
        
        for(int i = 1; i <= n; i++) {
            //숫자 i가 합성수 인지
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    su++;
                }  
            }
            if(su >= 3) {
                c++;
                System.out.println("i : " + i + " su : " + su + " c : " + c);
            }
            su = 0;
        }
        
        return c;
    }
}