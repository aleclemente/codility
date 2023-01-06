package lesson01.interations.binaryGap;

import lesson01.iterations.binaryGap.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void givenASequenceIntegerThenPrintTheBinaryStringRepresentation() {

        int N = 10;

        for(int i = 0; i <= N; i++) {

            System.out.println( i + " = " + Integer.toBinaryString(i) );

        }
    }

    @Test
    void givenAnIntegerArrayThenReturnABinaryGap() {

        int[][] N ={ {0,0}, {1,0}, {2,0}, {3,0}, {4,0}, {5,1}, {6,0}, {7,0}, {8,0}, {9,2}, {10,1}, {1041,5}, {65537,15}, {100000,4}, {2147483,5} };

        for (int[] n : N) {

            int longestBinaryGap = new Solution().solution(n[0]);

            assertEquals(n[1], longestBinaryGap);

        }
    }
}
