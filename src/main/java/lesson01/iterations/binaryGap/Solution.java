package lesson01.iterations.binaryGap;

public class Solution {

    public int solution(int N) {

        int longestBinaryGap = 0;

        if(N > 1) {

            int tempBinaryGap = 0;

            char[] binaryCharArray = Integer.toBinaryString(N).toCharArray();

            for (char c : binaryCharArray) {

                if (c == '0') {
                    tempBinaryGap++;
                } else if (c == '1') {
                    if (longestBinaryGap < tempBinaryGap) {
                        longestBinaryGap = tempBinaryGap;
                    }
                    tempBinaryGap = 0;
                }
            }
        }

        return longestBinaryGap;
    }

}
