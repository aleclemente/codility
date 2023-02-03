package exam01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    void givenABinaryNumberZeroThenConvertToDecimalAndReturnZeroStep(){
        assertEquals(0, solution.solution( new String("0")) );
    }

    @Test
    void givenABinaryNumberOneThenConvertToDecimalAndReturnOneStep(){
        assertEquals(1, solution.solution( new String("1")) );
    }

    @Test
    void givenABinaryNumberThenConvertToDecimalAndReturnFiveSteps() {

        assertEquals(5,solution.solution( new String("111")) );
    }

    @Test
    void givenABinaryNumberThenConvertToDecimalAndReturnSevenSteps(){
        assertEquals(7, solution.solution( new String("011100")) );
    }

    @Test
    void givenABinaryNumberThenConvertToDecimalAndReturnTwentyTwoSteps(){
        assertEquals(22, solution.solution( new String("1111010101111")) );
    }

    @Test
    void givenAHugeBinaryNumberThenConvertToDecimalAndReturnSevenHugeSteps(){
        String hugeBinary = "1".repeat(400000);
        assertEquals(799999, solution.solution( new String(hugeBinary)) );
    }
}
