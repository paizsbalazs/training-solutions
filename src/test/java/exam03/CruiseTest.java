
package exam03;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CruiseTest {

    private Boat boat = new Boat("WetDreams", 5);

    private Cruise cruise = new Cruise(boat, LocalDate.of(2021, 1, 1), 100_000);

    @Test
    void create() {
        assertEquals(boat, cruise.getBoat());
        assertEquals(LocalDate.of(2021, 1, 1), cruise.getSailing());
        assertEquals(100_000, cruise.getBasicPrice());
    }

    @Test
    void overBooking() {
        for (int i = 0; i < 5; i++) {
            cruise.bookPassenger(new Passenger("John Doe", CruiseClass.LUXURY));
        }
        assertThrows(IllegalArgumentException.class,
                () -> cruise.bookPassenger(new Passenger("John Doe", CruiseClass.LUXURY)));
    }

    @Test
    void getPriceForPassenger() {
        double price = cruise.getPriceForPassenger(new Passenger("John Doe", CruiseClass.LUXURY));
        assertEquals(300_000, price, 0.5);

        price = cruise.getPriceForPassenger(new Passenger("John Doe", CruiseClass.FIRST));
        assertEquals(180_000, price, 0.5);

        price = cruise.getPriceForPassenger(new Passenger("John Doe", CruiseClass.SECOND));
        assertEquals(100_000, price, 0.5);
    }
}