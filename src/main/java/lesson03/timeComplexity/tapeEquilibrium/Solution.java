package lesson03.timeComplexity.tapeEquilibrium;

import java.util.stream.IntStream;

class Solution {
    public int solution(int[] A){

        int totalSum = IntStream.of(A).sum();
        int firstPartSum = 0;
        int secondPartSum = totalSum;
        int minimalDifference = 1000*1000000;

        for(int i=0; i < A.length; i++){

            firstPartSum = firstPartSum + A[i];

            secondPartSum = secondPartSum - A[i];

            if(minimalDifference > Math.abs(firstPartSum - secondPartSum)){
                minimalDifference = Math.abs(firstPartSum - secondPartSum);
            }
        }

        return minimalDifference;
    }
}
