package week09d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestSanta {

    @Test
    public void TestSantaCreate() {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Tibor", 20));
        persons.add(new Person("Attila", 13));
        persons.add(new Person("Gabor", 12));
        persons.add(new Person("Adam", 45));

        SantaClaus santaClaus = new SantaClaus(persons);
        santaClaus.getThroughChimneys();

        assertNotEquals(null, persons.get(0).getPresent());
    }

}
