package exam03;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void givenAnArrayThenReturnZero(){
        Assertions.assertEquals(0, solution.solution(new int[] {1,2,3} ) );
    }

    @Test
    void givenAnArrayThenReturnSomething(){
        Assertions.assertEquals(0, solution.solution(new int[] {1,2,3} ) );
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
