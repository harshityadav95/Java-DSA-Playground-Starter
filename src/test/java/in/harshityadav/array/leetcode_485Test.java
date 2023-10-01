package in.harshityadav.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import in.harshityadav.array.leetcode_485;

import static in.harshityadav.array.leetcode_485.findMaxConsecutiveOnes;
import static org.junit.jupiter.api.Assertions.*;

class leetcode_485Test {

    @Test
    void TestfindMaxConsecutiveOnesCase1() {

        int[] input = {0, 0, 0, 1, 1, 0, 1, 1, 1, 1};

        int output = findMaxConsecutiveOnes(input);

        assertEquals(output, 4);

    }

    @Test
    void TestfindMaxConsecutiveOnesCase2() {

        int[] input = {1, 0, 1, 1, 0, 1};

        int output = findMaxConsecutiveOnes(input);

        assertEquals(output, 2);

    }
}