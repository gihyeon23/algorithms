class Solution {
    public String solution(int age) {
        String a = Integer.toString(age);
        //23 문자열
        System.out.println(String.valueOf((char)('a' + 1)));
        
        for(int i = 0; i < 10; i++) {
            a = a.replace(Integer.toString(i), String.valueOf((char)('a' + i))) ;
        }
        
        return a;
    }
}