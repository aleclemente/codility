package lesson02.arrays.cyclicRotation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void givenAnEmptyArrayThenReturnTheSameArray(){

        int[] A = {};

        int K = 1;

        int[] result = new Solution().solution(A, K);

        Assertions.assertArrayEquals(A, result);
    }

    @Test
    void givenArrayAAndIntegerKEqualsToALengthThenReturnSameAArray(){

        int[] A = {1, 2, 3, 4};

        int K = 4;

        int[] expected = {1, 2, 3, 4};

        int[] result = new Solution().solution(A, K);

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void givenArrayAAndIntegerKThenReturnArrayARotatedKTimes(){

        int[] A = {3, 8, 9, 7, 6};

        int K = 3;

        int[] expected = {9, 7, 6, 3, 8};

        int[] result = new Solution().solution(A, K);

        Assertions.assertArrayEquals(expected, result);
    }
}
