package lesson08.leader.dominator;

import java.util.Stack;

class Solution {

    public int solution(int[] A){

        Stack<Integer> stack = new Stack<>();

        if(A.length == 0) {
            return -1;
        }

        for(int i=0; i < A.length; i++){
            if(stack.empty() || A[stack.peek()] == A[i]){
                stack.push(i);
            } else {
                stack.pop();
            }
        }

       return stack.empty() ? -1 : stack.peek();
    }
}
