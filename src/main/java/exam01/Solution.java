package exam01;

import java.math.BigInteger;

class Solution {
    public int solution(String S){

        BigInteger decimalNumber = new BigInteger(S, 2);
        int steps = 0;

        while( decimalNumber.compareTo(BigInteger.ZERO) == 1 ){
            steps++;
            if(decimalNumber.mod(BigInteger.TWO) == BigInteger.ZERO) {
                decimalNumber = decimalNumber.divide(BigInteger.TWO);
            } else {
                decimalNumber = decimalNumber.subtract(BigInteger.ONE);
            }
        }

        return steps;
    }
}
