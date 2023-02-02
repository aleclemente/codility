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
/*
A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:

S is empty;
S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
S has the form "VW" where V and W are properly nested strings.
For example, the string "{[()()]}" is properly nested but "([)()]" is not.

Write a function:

class Solution { public int solution(String S); }

that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.

For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the function should return 0, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..200,000];
string S is made only of the following characters: "(", "{", "[", "]", "}" and/or ")".
 */