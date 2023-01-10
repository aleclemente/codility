package lesson02.arrays.cyclicRotation;

public class Solution {
    public int[] solution(int[] A, int K){

        if(A.length == 0 || K == 0 || A.length == K){
            return A;
        }


        for(int j = 0; j < K; j++){

            int lastItem = A[A.length-1];

            for(int i = A.length-1; i > 0; i--){
                A[i] = A[i-1];
            }

            A[0] = lastItem;
        }

        return A;
    }
}
