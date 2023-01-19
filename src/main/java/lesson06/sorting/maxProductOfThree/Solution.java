package lesson06.sorting.maxProductOfThree;

class Solution {
    public int solution(int[] A){
        int maximalProductOfThree = -1000*-1000*-1000;
        for(int i=0; i < A.length; i++){
            for(int j=i+1; j < A.length; j++){
                for(int k=j+1; k < A.length; k++){
                    if(i==A.length-3 & j==A.length-2 & k==A.length-1){
                        if(A[i] * A[j] * A[k] > maximalProductOfThree) {
                            maximalProductOfThree = A[i] * A[j] * A[k];
                        }
                        return maximalProductOfThree;
                    } else if(A[i] * A[j] * A[k] > maximalProductOfThree) {
                        maximalProductOfThree = A[i] * A[j] * A[k];
                    }
                }
            }
        }
        return maximalProductOfThree;
    }
}
