package lesson03.timeComplexity.tapeEquilibrium;

class Solution {
    public int solution(int[] A){

        int minimalDifference = 0;
        int firstPartDifference = 0;
        int secondPartDifference = 0;

        if(A.length < 2) {

            minimalDifference = Math.abs(A[0]);

        } else {

            for(int i=0; i < A.length; i++){

                for(int j=0; j<i; j++){
                    firstPartDifference += A[j];
                }

                for(int k=i; k<A.length; k++){
                    secondPartDifference += A[k];
                }

                if(i==0){
                    minimalDifference = Math.abs(firstPartDifference - secondPartDifference);
                } else if( minimalDifference > Math.abs(firstPartDifference - secondPartDifference) ){
                    minimalDifference = Math.abs(firstPartDifference - secondPartDifference);
                }

                firstPartDifference = 0;
                secondPartDifference = 0;
            }
        }

        return minimalDifference;
    }
}
