package in.harshityadav.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class A002evenNumberDigitsTest {

    @Test
    void eventNumberDigitsCase1() {
        int[] input = {12, 345, 2, 6, 7896};
        int output = A002evenNumberDigits.evenNumberDigits(input);
        assertEquals(2, output);
    }

    @Test
    void evenNumberDigitCase2() {
        int[] input = {};
        int output = A002evenNumberDigits.evenNumberDigits(input);
        assertEquals(0, output);
    }
}