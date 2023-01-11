package lesson03.timeComplexity.permMissingElem;

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {

        Arrays.sort(A);

        int searchIndex = 0;
        int nextIndex = 1;
        int penultIndex = A.length-2;
        int lastIndex = A.length-1;
        boolean indexFound = false;

        if(A.length == 1 || A[searchIndex]+1 != A[nextIndex]) {
            indexFound = true;
        } else if(A[penultIndex]+1 != A[lastIndex]) {
            searchIndex = penultIndex;
            indexFound = true;
        }

        while(!indexFound) {
            if(A[searchIndex]+1 != A[nextIndex] || nextIndex+1 == lastIndex) {
                indexFound = true;
            } else {
                searchIndex++;
                nextIndex++;
            }
        }

        return A[searchIndex]+1;
    }
}
