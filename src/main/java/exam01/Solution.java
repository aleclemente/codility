package exam01;

class Solution {
    public int solution(String S){

        char[] binary = S.toCharArray();

        if(binary.length == 1){
            if(binary[0] == '0') {
                return 0;
            } else {
                return 1;
            }
        }

        int steps = -1;

        for(int i = 0; i < binary.length; i++){
            if( binary[i] == '1'){
                steps = steps + 2;
            } else if ( binary[i] == '0' && steps > 0){
                steps = steps + 1;
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

/*
Solution using BigInteger low performance
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
*/
