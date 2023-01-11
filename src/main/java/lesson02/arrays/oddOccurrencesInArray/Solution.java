package lesson02.arrays.oddOccurrencesInArray;

import java.util.Arrays;

class Solution {
    public int solution(int[] A){

        if(A.length == 1) return A[0];

        Arrays.sort(A);

        int oddOccurrenceIndex = 0;
        int nextIndex = 1;
        int lastIndex = A.length-1;
        boolean foundIndex = false;

        while(!foundIndex){
            if(A[oddOccurrenceIndex] != A[nextIndex] ) {
                foundIndex = true;
            } else if(oddOccurrenceIndex + 2 == lastIndex) {
                oddOccurrenceIndex = oddOccurrenceIndex + 2;
                foundIndex = true;
            } else {
                oddOccurrenceIndex = oddOccurrenceIndex + 2;
                nextIndex = nextIndex + 2;
            }
        }
        return A[oddOccurrenceIndex];
    }
}
