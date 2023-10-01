package in.harshityadav.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static in.harshityadav.array.leetcode_1295.findNumbers;

class leetcode_1295Test {

    @Test
    void findNumbersTest1() {

        int[] test = {12, 345, 2, 6, 7896};

        int output = findNumbers(test);
        Assertions.assertEquals(output, 2);

    }

    @Test
    void findNumbersTest2() {

        int[] test = {12, 345, 2, 6, 7896};

        int output = findNumbers(test);
        Assertions.assertNotEquals(output, 3);

    }
}