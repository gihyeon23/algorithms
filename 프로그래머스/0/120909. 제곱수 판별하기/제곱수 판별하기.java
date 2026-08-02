class Solution {
    public int solution(int n) {
        double d = Math.sqrt(n);

        return (d%1 == 0) ? 1 : 2;
    }
}