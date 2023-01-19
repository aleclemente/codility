package lesson05.prefixSum.passingCars;

class Solution {
    int countZero = 0;
    int totalPairs = 0;

    public int solution(int[] A) {
        for(int i=0; i < A.length; i++) {

            if(totalPairs > 1000000000) {
                return -1;
            } else if(A[i] == 0) {
                countZero++;
            } else {
                totalPairs = totalPairs + countZero;
            }

        }
        return totalPairs;
    }
}
