package lesson09.maximumSliceProblem.maxProfit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    void givenAnArrayWithoutAnyStockSharePricesThenReturnZero(){
        assertEquals(0, solution.solution(new int[] {}));
        assertEquals(0, solution.solution(new int[] {23171}));
    }

    @Test
    void givenAnArrayWithStockSharePricesThenReturnMaximumProfit(){
        assertEquals(356, solution.solution(new int[] {23171, 21011, 21123, 21366, 21013, 21367}));
    }
}
