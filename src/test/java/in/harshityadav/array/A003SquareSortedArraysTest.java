package in.harshityadav.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class A003SquareSortedArraysTest {

    @Test
    void sortedSquares() {

        int[] input = {-4, -1, 0, 3, 10};
        int[] output = A003SquareSortedArrays.sortedSquares(input);
        assertArrayEquals(new int[]{0, 1, 9, 16, 100}, output);


    }

    @Test
    void nullValueTest() {

        int[] output = A003SquareSortedArrays.sortedSquares(null);
        assertArrayEquals(new int[]{}, output);

    }
}