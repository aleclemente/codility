package lesson04.countingElements.maxCounters;

import java.util.Arrays;

class Solution {
    public int[] solution(int N, int[] A) {

        int[] B = new int[N];
        int maxCounter = 0;

        for(int i=0; i < A.length-1; i++){
            if(A[i] > A.length){

            } else {

            }
            B[A[i]-1]++;
        }

        return B;
    }
}
