package lesson04.countingElements.permCheck;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    void givenAnNotPermutableArrayThenReturnMinusOne(){

        assertEquals(0, solution.solution(new int[] {4, 1, 3}) );

    }

    @Test
    void givenAnPermutableArrayThenReturnOne(){

        assertEquals(1, solution.solution( new int[] {4, 1, 3, 2}) );

    }
}
