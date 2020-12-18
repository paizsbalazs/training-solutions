package week07d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MathAlgorithmsTest {

    @Test
    public void MathAlgorithmsTestCreate() {

        MathAlgorithms mathAlgorithms = new MathAlgorithms();
        assertTrue(mathAlgorithms.isPrime(13));
        assertFalse(mathAlgorithms.isPrime(4));

    }

}
