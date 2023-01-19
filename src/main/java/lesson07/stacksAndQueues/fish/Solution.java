package lesson07.stacksAndQueues.fish;

import java.util.Stack;

class Solution {
    public int solution(int[] A, int[] B){

        if(A.length == 1) {
            return 1;
        }

        Stack<Integer> fishsStack = new Stack<>();

        fishsStack.push(0);

        for(int i=1; i < A.length; i++) {

            //System.out.println( "\nPeixe " + fishsStack.peek() + ": " + A[fishsStack.peek()] + " " + ( B[fishsStack.peek()] == 0 ? "A" : "v" ) + " / Peixe " + i + ": " + A[i] + " " + ( B[i] == 0 ? "A" : "v" ) );

            if (B[fishsStack.peek()] == B[i] || (B[fishsStack.peek()] == 0 && B[i]==1) ) {
                fishsStack.push(i);
            } else if (A[fishsStack.peek()] < A[i] ){
                fishsStack.pop();
                fishsStack.push(i);
            }

            //System.out.println( "\nPeixe " + fishsStack.peek() + ": " + A[fishsStack.peek()] + " " + ( B[fishsStack.peek()] == 0 ? "A" : "v" ) + " / Peixe " + i + ": " + A[i] + " " + ( B[i] == 0 ? "A" : "v" ) );

        }

       return fishsStack.size();
    }
}
