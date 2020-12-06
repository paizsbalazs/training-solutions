package week06d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BiscuitTest {

    @Test
    public void CreateBiscuitTest() {

        Biscuit biscuit = Biscuit.of(BiscuitType.CHOCOLATE, 50);
        assertTrue(biscuit.getGramAmount() == 50);
    }
}
