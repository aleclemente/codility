package exam02;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class SolutionTest {
    Solution solution = new Solution();


    @Test
    void givenASequencedArrayThenReturnTwo(){
        Assertions.assertEquals(1, solution.solution(new int[] {-1} ) );
        Assertions.assertEquals(1, solution.solution(new int[] {0} ) );
        Assertions.assertEquals(2, solution.solution(new int[] {1} ) );
        Assertions.assertEquals(1, solution.solution(new int[] {2} ) );
        Assertions.assertEquals(1, solution.solution(new int[] {3} ) );
    }

    @Test
    void givenAnArrayThenReturnSmallestPositiveNumber(){
        Assertions.assertEquals(1, solution.solution(new int[] {3, 4} ) );
        Assertions.assertEquals(1, solution.solution(new int[] {-1, -3} ) );
        Assertions.assertEquals(1, solution.solution(new int[] {-1, -3, -1, 0, 4, 2, 3} ) );
        Assertions.assertEquals(1, solution.solution(new int[] {-1, -3, -1, 4, 2, 3} ) );
        Assertions.assertEquals(1, solution.solution(new int[] {-2, -3, -2, 4, 2, 3} ) );
        Assertions.assertEquals(3, solution.solution(new int[] {-1, -3, -1, 1, 5, 2, 4} ) );
        Assertions.assertEquals(2, solution.solution(new int[] {-1, -3, -1, 4, 1, 3} ) );
        Assertions.assertEquals(2, solution.solution(new int[] {-1, -3, -1, 0, 4, 1, 3} ) );
        Assertions.assertEquals(4, solution.solution(new int[] {1, 2, 3} ) );
        Assertions.assertEquals(5, solution.solution(new int[] {1, 3, 6, 4, 1, 2} ) );
        Assertions.assertEquals(5, solution.solution(new int[] {1, 3, 6, 4, 1, 2, 6} ) );
        Assertions.assertEquals(2, solution.solution(new int[] {1, 3, 6, 3, 1, 6} ) );
    }

    @Test
    void givenAnArrayThenReturnSmallestPositiveNumber2(){
        Assertions.assertEquals(5, solution.solution(new int[] {1, 3, 6, 4, 1, 2} ) );
        Assertions.assertEquals(5, solution.solution(new int[] {1, 3, 6, 4, 1, 2, 6} ) );
        Assertions.assertEquals(2, solution.solution(new int[] {1, 3, 6, 3, 1, 6} ) );
    }



    /*
    @Test
    void givenABinaryNumberZeroThenConvertToDecimalAndReturnZeroSteps(){
        Assertions.assertEquals(0, solution.solution( ) );
    }
    //*/

    /*
    @Test
    void givenAnEmptyArrayThenReturnTheSameArray(){

        int[] A = {};

        int K = 1;

        int[] result = new lesson02.arrays.cyclicRotation.Solution().solution(A, K);

        Assertions.assertArrayEquals(A, result);
    }
    //*/
}
