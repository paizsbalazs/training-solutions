package week10d05;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {

    @Test
    public void TestCalculatorCreate() {

        int[] myIntArray = new int[]{1, 3, 9, 7, 5};
        Calculator calculator = new Calculator();
        assertEquals(16, calculator.findMinSum(myIntArray));

    }
}
