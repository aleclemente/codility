package lesson05.prefixSum.passingCars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    void givenAnArrayThenReturnPairs(){

        assertEquals(5, solution.solution(new int[] {0, 1, 0, 1, 1}) );

    }
}
