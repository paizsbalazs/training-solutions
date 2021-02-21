package week04d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameChangerTest {


    @Test
    void testNameCharger1() {
        NameChanger nameChanger = new NameChanger("Kiss Ferenc");
        nameChanger.changeFirstName("Péter");
        assertEquals("Kiss Péter", nameChanger.getFullName());
    }

}