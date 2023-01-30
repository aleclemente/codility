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
/*
Recebe um número binário transforma em decimal e verifica se esse é par, caso positivo divida por dois, caso seja impar subtrai por um.
Conte quando passos foram necessários

Por exemplo:
011100 = 28
Número par, divide por 2 = 14
Número par, divide por 2 = 7
Número impar, subtrai 1 = 6
Número par, divide por 2 = 3
Número impar, subtrai 1 = 2
Número par, divide por 2 = 1
Número impar, subtrai 1 = 0

Resposta: 7 Passos
 */
