package lesson07.stacksAndQueues.fish;

import java.util.Stack;

class Solution {
    public int solution(int[] fishSize, int[] fishDirection) {

        if (fishSize.length == 1 || fishDirection.length == 1) {
            return 1;
        }

        Stack<Integer> survivalsDownstreamIndex = new Stack<>();

        int survivalsUpstream = 0;

        for (int i = 0; i < fishSize.length; i++) {

            int size = fishSize[i];
            int direction = fishDirection[i];
            boolean survives = true;

            if (direction == 0) {

                while (!survivalsDownstreamIndex.empty()) {

                    if (size > fishSize[survivalsDownstreamIndex.peek()]) {
                        survivalsDownstreamIndex.pop();
                    } else {
                        survives = false;
                        break;
                    }

                }

                if(survives){
                    survivalsUpstream++;
                }
            } else {
                survivalsDownstreamIndex.push(i);
            }

        }

        return survivalsDownstreamIndex.size() + survivalsUpstream;
    }
}
