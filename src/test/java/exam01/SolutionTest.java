package exam01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    void givenABinaryNumberThenConvertTurnZero(){
        assertEquals(7, solution.solution( new String("011100")) );
    }
}
