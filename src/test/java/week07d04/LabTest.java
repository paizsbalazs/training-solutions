package week07d04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LabTest {

    @Test
    public void LabTestCreate() {
        Lab lab = new Lab("Task1");
        assertEquals("Task1", lab.getTitle());
    }

    @Test
    public void LabTestCreateTAD() {
        Lab lab = new Lab("Task1", LocalDate.of(2020, 12, 9));
        assertEquals("Task1", lab.getTitle());
        assertTrue(lab.isCompleted());
        assertEquals(LocalDate.of(2020, 12, 9),lab.getCompletedAt());
    }

    @Test
    public void LabTestCreateNow() {
        Lab lab = new Lab("Task2");
        lab.complete();
        assertTrue(lab.isCompleted());
        assertEquals(LocalDate.of(2020,12,10),lab.getCompletedAt());

    }
}
