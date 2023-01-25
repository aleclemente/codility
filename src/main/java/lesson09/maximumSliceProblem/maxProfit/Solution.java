package lesson09.maximumSliceProblem.maxProfit;

import static java.lang.Math.max;

class Solution {
    public int solution(int[] A){
        int maxProfit = 0;

        if(A.length < 2){
            return maxProfit;
        }

        int maxEnding = 0;
        int maxSlice = 0;

        for(int i=0; i < A.length; i++){
            for(int j=i+1; j < A.length; j++) {
                maxEnding = max(maxEnding, A[j] - A[i]);
                maxSlice = max(maxEnding, maxSlice);
            }
        }

        return maxSlice;
    }
}