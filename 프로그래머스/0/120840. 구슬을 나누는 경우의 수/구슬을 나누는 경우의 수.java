import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        BigInteger up = BigInteger.ONE;
        BigInteger du = BigInteger.ONE;

        for (int i = 0; i < share; i++) {
            up = up.multiply(BigInteger.valueOf(balls - i));
            du = du.multiply(BigInteger.valueOf(share - i));
        }

        return up.divide(du).intValue();
    }
}