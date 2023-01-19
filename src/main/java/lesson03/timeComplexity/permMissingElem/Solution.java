package lesson03.timeComplexity.permMissingElem;

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {

        if(A.length == 0) {
            return 1;
        }

        Arrays.sort(A);

        if(A[A.length-1] == A.length) {
            return A.length+1;
        }

        for(int i=0; i < A.length; i++) {
            if(A[i] != i+1){
                return i+1;
            }
        }

        return 0;
    }
}
