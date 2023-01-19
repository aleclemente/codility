package lesson03.timeComplexity.tapeEquilibrium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    void givenAnArrayThenReturnMinimalAbsolutDifference(){
        assertEquals(1, solution.solution( new int[]{3, 1, 2, 4, 3} ) );
    }
}
