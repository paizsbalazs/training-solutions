package week07d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VechicleTest {

    @Test
    public void VehicleTestCreate() {

        Vechicle vechicle = new Vechicle();
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        assertEquals("MANUAL 5", vechicle.getTransmissionType() + " " + vechicle.getNumberofGears());
        assertEquals("AUTOMATIC 5", car.getTransmissionType() + " " + car.getNumberofGears());
        assertEquals("SEQUENTIAL 5", motorcycle.getTransmissionType() + " " + motorcycle.getNumberofGears());

    }
}
