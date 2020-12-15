package week08d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LotteryTest {

    @Test
    public void LotteryTestCreate() {

        Lottery lottery = new Lottery();
        assertEquals("[18, 83, 45, 15, 67]", lottery.getNumbers(90, 5).toString());
    }
}
