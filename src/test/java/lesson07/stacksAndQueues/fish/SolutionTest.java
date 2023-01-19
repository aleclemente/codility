package lesson07.stacksAndQueues.fish;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    void givenTwoArraysOfFishThenReturnSurvivals(){
        assertEquals(2, solution.solution(new int[]{4, 3, 2, 1, 5}, new int[]{0, 1, 0, 0, 0}));
        assertEquals(2, solution.solution(new int[]{0, 1}, new int[]{1, 1}));
        assertEquals(1, solution.solution(new int[]{1, 0}, new int[]{1, 0}));
        assertEquals(2, solution.solution(new int[]{4, 2, 5, 3}, new int[]{1, 1, 0, 1}));
    }
}
