package lesson06.sorting.distinct;

import java.util.HashSet;
import java.util.Set;

class Solution {

    public int solution(int[] A){

        int amountOfdistinctNumbersInArray = 0;
        Set<Integer> arrayOfDistinctNumbers = new HashSet<>();

        if(A.length == 1) {
            amountOfdistinctNumbersInArray = A.length;
        } else {
            for(int i=0; i < A.length; i++){
                arrayOfDistinctNumbers.add(A[i]);
            }
            amountOfdistinctNumbersInArray = arrayOfDistinctNumbers.size();
        }
        return amountOfdistinctNumbersInArray;
    }
}
