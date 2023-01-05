package lessons.interations.binaryGap;

import lessons.iterations.binaryGap.Solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void givenAnIntegerZeroThenReturnABinaryGapZero() {

        int n = 0;

        int result = new Solution().solution(n);

        assertEquals(0, result);
    }
}
