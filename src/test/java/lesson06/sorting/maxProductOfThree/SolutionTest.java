package lesson06.sorting.maxProductOfThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    void givenAnArrayWithSomeNegativesThenReturnProductOfThree(){
        assertEquals(125, solution.solution(new int[] {-5, 5, -5, 4}));
    }

    @Test
    void givenAnArrayThenReturnMacimalProductOfThree(){
        assertEquals(60, solution.solution(new int[] {-3, 1, 2, -2, 5, 6}));
    }
}
