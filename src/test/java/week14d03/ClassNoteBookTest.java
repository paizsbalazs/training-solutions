package week14d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClassNoteBookTest {

    @Test
    public void CreateTest() {
        ClassNoteBook cb2 = new ClassNoteBook(Arrays.asList(new Student("Béla"), new Student("Andras"), new Student("Károly"), new Student("Istváb") ));
        ClassNoteBook cb = new ClassNoteBook(new ArrayList<>(List.of(new Student("Tibor"), new Student("Andras"), new Student("Károly"), new Student("Istváb"))));
        List<Student> result = cb2.sortNoteBook();
        System.out.println(cb.getStudents());

        assertEquals("Andras", result.get(0).getName());
        assertEquals("Béla", result.get(1).getName());


    }

}