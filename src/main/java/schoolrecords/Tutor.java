package schoolrecords;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Tutor {

    private String name;
    public List<Subject> taughtSubject = new ArrayList<>();

    public Tutor(String name, List<Subject> taughtSubject) {
        this.name = name;
        this.taughtSubject = taughtSubject;
    }

    public String getName() {
        return name;
    }

    public boolean tutorTeachingSubject(Subject subject) {

        boolean x = false;

        for (int f = 0; f < taughtSubject.size(); f++) {

            //System.out.println(subject.getSubjectName());
            //System.out.println(taughtSubject.get(f).getSubjectName());

            if (taughtSubject.get(f).getSubjectName().equals(subject.getSubjectName())) {
                x = true;
            }

        }

        return x;
    }
}
