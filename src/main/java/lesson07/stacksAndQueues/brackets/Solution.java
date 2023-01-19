package lesson07.stacksAndQueues.brackets;

import java.util.Stack;

class Solution {
    public int solution(String S){

        char[] chars = S.toCharArray();

        if(chars.length == 0) {
            return 1;
        }

        if(chars.length % 2 != 0) {
            return 0;
        }

        Stack<Character> brackets = new Stack<Character> ();

        for(char c : chars){

            if(brackets.empty()) {
                if(c == '}' || c == ')' || c == ']') {
                    return 0;
                } else {
                    brackets.push(c);
                }
            } else {
                if(validateDoubleNestedBrackets(brackets.peek(), c)) {
                    brackets.pop();
                } else {
                    brackets.push(c);
                }
            }

        }

       return brackets.empty() ? 1 : 0;
    }

    private boolean validateDoubleNestedBrackets(char openChar, char closeChar) {
        return (openChar == '{' && closeChar == '}') || (openChar == '[' && closeChar == ']') || (openChar == '(' && closeChar == ')') ? true : false;
    }
}
