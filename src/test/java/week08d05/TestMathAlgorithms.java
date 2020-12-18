package week08d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMathAlgorithms {

    @Test
    public void TestMathAlgorithmsCreate() {
        MathAlgorithms mathAlgorithms = new MathAlgorithms();
        assertTrue(5 == mathAlgorithms.greatestCommonDivisor(9784235, 230) );
    }
}
