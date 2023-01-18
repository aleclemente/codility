package lesson07.stacksAndQueues.brackets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    Solution_OLD solution = new Solution_OLD();

    @Test
    void givenStringWithOneClosedBracketThenReturnZero(){
        assertEquals(0, solution.solution("}"));
        assertEquals(0, solution.solution("]"));
        assertEquals(0, solution.solution(")"));
    }

    @Test
    void givenStringWithOddNumberOfBracketsThenReturnZero(){
        assertEquals(0, solution.solution("([)"));
    }

    @Test
    void givenStringOfBracketsNotNestedProperlyClosedThenReturnZero(){
        assertEquals(0, solution.solution("{([]"));
    }

    @Test
    void givenStringOfBracketsNotNestedProperlyThenReturnZero(){
        assertEquals(0, solution.solution("([)()]"));
    }

    @Test
    void givenStringOfBracketsEmptyThenReturnOne(){
        assertEquals(1, solution.solution(""));
    }

    @Test
    void givenStringWithAPairOfClosedBracketNestedProperlyThenReturnOne(){
        assertEquals(1, solution.solution("{}"));
        assertEquals(1, solution.solution("[]"));
        assertEquals(1, solution.solution("()"));
    }

    @Test
    void givenStringOfBracketsNestedProperlyThenReturnOne(){
        assertEquals(1, solution.solution("{[()()]}"));
    }

    @Test
    void givenStringOfBracketsNestedProperlyDoneThenReturnOne(){
        assertEquals(1, solution.solution("()(()())((()())(()()))"));
    }
}
