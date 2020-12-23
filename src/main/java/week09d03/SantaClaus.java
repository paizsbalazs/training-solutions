package week09d03;

import java.util.ArrayList;
import java.util.List;

public class SantaClaus {

    List<Person> persons = new ArrayList<>();

    public SantaClaus(List<Person> persons) {
        this.persons = persons;
    }

    public void getThroughChimneys() {
        for (int i = 0; i < persons.size(); i++) {
            persons.get(i).setPresent();
        }
    }
}
