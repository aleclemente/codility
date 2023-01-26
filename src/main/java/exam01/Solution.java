package exam01;

class Solution {
    public int solution(String binary){

        int decimalNumber = Integer.parseInt(binary, 2);
        int countSteps = 0;

        while( decimalNumber > 0 ){
            countSteps++;
            if(decimalNumber % 2 == 0) {
                decimalNumber = decimalNumber / 2;
            } else {
                decimalNumber--;
            }
        }

        return countSteps;
    }
}
