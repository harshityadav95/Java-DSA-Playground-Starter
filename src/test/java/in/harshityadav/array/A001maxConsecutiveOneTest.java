package in.harshityadav.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class A001maxConsecutiveOneTest {

    @Test
    void TestEmptyArray() {
        int[] input = {};
        int output = A001maxConsecutiveOne.findMaxConsecutiveOnes(input);
        assertEquals(0, output);
    }

    @Test
    void TestNormalArray() {
        int[] input = {0, 0, 1, 1, 0, 1, 1, 1};
        int output = A001maxConsecutiveOne.findMaxConsecutiveOnes(input);
        assertEquals(3, output);
    }

    @Test
    void TestOnlyZero() {
        int[] input = {0};
        int output = A001maxConsecutiveOne.findMaxConsecutiveOnes(input);
        assertEquals(0, output);
    }
}