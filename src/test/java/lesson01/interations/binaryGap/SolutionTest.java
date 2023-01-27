package lesson01.interations.binaryGap;

import lesson01.iterations.binaryGap.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void givenAnIntegerArrayThenReturnABinaryGap() {

        int[][] N ={ {0,0}, {1,0}, {2,0}, {3,0}, {4,0}, {5,1}, {6,0}, {7,0}, {8,0}, {9,2}, {10,1}, {15,0}, {20,1}, {32,0}, {529,4}, {1041,5}, {65537,15}, {100000,4}, {2147483,5} };

        for (int[] n : N) {

            System.out.println("Decimal number: " + n[0] + " | " + " Binary: " + Integer.toBinaryString(n[0]) + " | " + "Longest Binary Gap: " + n[1] );

            int longestBinaryGap = new Solution().solution(n[0]);

            assertEquals(n[1], longestBinaryGap);

        }
    }
}
