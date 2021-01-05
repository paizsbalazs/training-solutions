package week10d02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxTravelTest {

    @Test
    void CreateMaxTravelTest() {

        MaxTravel maxTravel = new MaxTravel();
        List<Integer> megallo = List.of(12,12,12,0,3,4,4,4,4);
        assertEquals(4, maxTravel.getMaxIndex(megallo));


    }
}
