package lesson03.timeComplexity.permMissingElem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void givenAnArrayThenReturnMissingElement() {
        assertEquals(2, solution.solution(new int[] {1}));
        assertEquals(2, solution.solution(new int[] {1, 3}));
        assertEquals(3, solution.solution(new int[] {4, 1 ,2}));
        assertEquals(4, solution.solution(new int[] {2, 3, 1, 5}));
        assertEquals(5, solution.solution(new int[] {7, 6, 4, 8, 9}));
    }
}
