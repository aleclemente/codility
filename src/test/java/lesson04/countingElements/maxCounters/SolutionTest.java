package lesson04.countingElements.maxCounters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    void givenAnArrayThenReturnMinusOne(){

        assertArrayEquals(new int[] {3, 2, 2, 4, 0}, solution.solution(6, new int[] {4, 1, 3}));

    }

    @Test
    void givenAnPermutableArrayThenReturnOne(){

        assertArrayEquals(new int[] {3, 2, 2, 4, 2}, solution.solution(5, new int[] {3, 4, 4, 6, 1, 4, 4}));

    }
}
