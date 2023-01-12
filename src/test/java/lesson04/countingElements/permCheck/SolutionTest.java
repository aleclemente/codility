package lesson04.countingElements.permCheck;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    void givenAnNotPermutableArrayThenReturnMinusOne(){

        int[] A = {4, 1, 3};

        assertEquals(0, solution.solution(A));

    }

    @Test
    void givenAnPermutableArrayThenReturnOne(){

        int[] A = {4, 1, 3, 2};

        assertEquals(1, solution.solution(A));

    }
}
