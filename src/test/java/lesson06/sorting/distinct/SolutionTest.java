package lesson06.sorting.distinct;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    void givenArrayOfZeroThenReturnZero() {

        assertEquals(0, solution.solution(new int[] {}));
    }

    @Test
    void givenArrayOfOneThenReturnOne() {

        assertEquals(1, solution.solution(new int[] {2}));
    }

    @Test
    void givenAnArrayThenReturnAmountOfDistinctNumber() {

        assertEquals(3, solution.solution(new int[] {2, 1, 1, 2, 3, 1}));
    }
}
