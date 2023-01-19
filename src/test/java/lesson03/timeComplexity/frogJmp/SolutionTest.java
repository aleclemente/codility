package lesson03.timeComplexity.frogJmp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void whenXAndYIgual() {

        assertEquals(0, solution.solution(1, 1, 3));
    }


    @Test
    void whenNeedOneJump() {

        assertEquals(1, solution.solution(10, 40, 30));
    }

    @Test
    void whenNeedTwoJumps() {

        assertEquals(2, solution.solution(10, 70, 30));
    }

    @Test
    void whenNeedThreeJumps() {

        assertEquals(3, solution.solution(10, 85, 30));
    }

    @Test
    void whenNeedFourJumps() {

        assertEquals(4, solution.solution(10, 130, 30));
    }

}
/*
A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.

Count the minimal number of jumps that the small frog must perform to reach its target.

Write a function:

class Solution { public int solution(int X, int Y, int D); }

that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.

For example, given:

  X = 10
  Y = 85
  D = 30
the function should return 3, because the frog will be positioned as follows:

after the first jump, at position 10 + 30 = 40
after the second jump, at position 10 + 30 + 30 = 70
after the third jump, at position 10 + 30 + 30 + 30 = 100
Write an efficient algorithm for the following assumptions:

X, Y and D are integers within the range [1..1,000,000,000];
X ≤ Y.
Copyright 2009–2023 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
 */
