package week14d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void addMark() {

        Student s = new Student("John");
        s.addMark("math", 5);
        assertEquals(1, s.getMarks().size());
        s.addMark("bio", 4);
        assertEquals(2, s.getMarks().size());
        assertEquals(4, s.getMarks().get("bio").get(0));
    }
}