package lesson08.leader.dominator;

import java.util.Stack;

class Solution {

    public int solution(int[] A){

        Stack<Integer> stack = new Stack<>();

        int candidateIndex = -1;
        int leaderIndex = -1;

        if(A.length == 0) {
            return leaderIndex;
        }

        for(int i=0; i < A.length; i++){
            if( stack.empty()) {
                stack.push(i);
            } else {
                if (A[stack.peek()] != A[i]) {
                    stack.pop();
                } else {
                    stack.push(i);
                }
            }
        }

        if(stack.size() > 0){
            candidateIndex = stack.peek();
        } else {
            return leaderIndex;
        }

        int count = 0;
        for(int i=0; i < A.length; i++){
            if(A[i] == A[candidateIndex]) {
                count++;
            }
        }

        if(count > (A.length / 2) ){
            leaderIndex = candidateIndex;
        }

       return leaderIndex;
    }
}
