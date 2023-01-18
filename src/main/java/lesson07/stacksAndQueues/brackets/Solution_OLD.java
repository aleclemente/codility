package lesson07.stacksAndQueues.brackets;

import java.util.Stack;

class Solution_OLD {
    public int solution(String S){

        char[] charArray = S.toCharArray();

        int properlyNested = 1;

        if(charArray.length == 0) {
            return properlyNested;
        }

        if(charArray.length % 2 != 0) {
            properlyNested = 0;
            return properlyNested;
        }

        Stack<Character> stackBrackets = new Stack<Character> ();

        stackBrackets.push(charArray[0]);

        for(int i=1; i < charArray.length; i++){

            if( ( stackBrackets.empty() && ( charArray[i] == '}' || charArray[i] == ')' || charArray[i] == ']' ) )
                    || ( !stackBrackets.empty() && stackBrackets.peek() == '{' && ( charArray[i] == ')' || charArray[i] == ']' ) )
                    || ( !stackBrackets.empty() && stackBrackets.peek() == '[' && ( charArray[i] == '}' || charArray[i] == ')' ) )
                    || ( !stackBrackets.empty() && stackBrackets.peek() == '(' && ( charArray[i] == '}' || charArray[i] == ']' ) ) ) {
                properlyNested = 0;
                return properlyNested;
            } else if( !stackBrackets.empty() && ( ( stackBrackets.peek() == '{' && charArray[i] == '}' )
                        || ( stackBrackets.peek() == '[' && charArray[i] == ']' )
                        || ( stackBrackets.peek() == '(' && charArray[i] == ')' ) ) ) {
                stackBrackets.pop();
            } else {
                stackBrackets.push(charArray[i]);
            }
        }

        if(!stackBrackets.empty()) {
            properlyNested = 0;
        }

        return properlyNested;
    }
}
