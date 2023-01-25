package lesson08.leader.dominator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    void givenAnEmptyArrayWithNoDominatorThenReturnMinusOne(){
        assertEquals(-1, solution.solution(new int[] {}));
    }

    @Test
    void givenAnArrayWithDominatorThenReturnMaxIndexDominator(){
        assertEquals(7, solution.solution(new int[] {3, 4, 3, 2, 3, -1, 3, 3}));
        assertEquals( 2, solution.solution(new int[] {0, 1, 1, 1, 0}));
        assertEquals(2, solution.solution(new int[] {1, 2, 1}));
        assertEquals(-1, solution.solution(new int[] {2, 1, 1, 3, 4}));
        assertEquals(-1, solution.solution(new int[] {2, 1, 1, 3}));
    }
}
