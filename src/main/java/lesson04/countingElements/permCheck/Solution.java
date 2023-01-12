package lesson04.countingElements.permCheck;

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {

        Arrays.sort(A);

        int lastIndex = A.length-1;
        int lastItem = A[lastIndex];

        if (lastIndex == lastItem-1) {
            return 1;
        }

        return 0;
    }
}
