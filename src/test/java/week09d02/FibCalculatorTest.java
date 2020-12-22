package week09d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FibCalculatorTest {

    @Test
    public void FibCalculatorTestCreate() {

        FibCalculator fibCalculator = new FibCalculator();
        assertTrue(10 == fibCalculator.sumEvens(21));
    }
}
