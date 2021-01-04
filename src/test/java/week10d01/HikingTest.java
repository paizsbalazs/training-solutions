package week10d01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HikingTest {

    @Test
    public void HikingTestCreate() {

    Hiking hiking = new Hiking();

        assertEquals(13.0, hiking.getPlusElevation(List.of(10.0 , 20.0, 15.0, 18.0)));

    }
}
