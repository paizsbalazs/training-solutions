package schoolrecords;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.math.RoundingMode;

public class Student {

    private String name;
    private List<Mark> marks = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Student(String name, List<Mark> marks) {

        if (name.equals(""))
            throw new IllegalArgumentException("Student name must not be empty!");

        this.marks = marks;
        this.name = name;
    }

    public void grading(Mark mark) {


        if (mark==null) {
            throw new NullPointerException("Mark must not be null!");
        } else {
            marks.add(mark);
        }

    }

    public String toString() {

        String res = "";

        for (int j = 0; j < this.marks.size(); j++) {
            res = this.name + " marks: " + this.marks.get(j).getSubject().getSubjectName() + ": " + this.marks.get(j).getMarkType().getDescription() + "(" +
                    this.marks.get(j).getMarkType().getValue() + ")";
        }

        return res;
    }

    public double calculateAverage() {
        int atlag = 0;

        Double at = 0.0;

        if (marks.size()==0) {
            throw new ArithmeticException("No marks present, average calculation aborted!");
        }

        for (int a = 0; a < marks.size(); a++) {

            atlag = atlag + marks.get(a).getMarkType().getValue();
            at = at + 1.0;
        }

        double round = Math.round((atlag/at) * 100.0) / 100.0;

        return round;
    }

    public double calculateSubjectAverage(Subject subject) {
        int atlag = 0;

        Double at = 0.0;

        for (int a = 0; a < marks.size(); a++) {

            if (subject.getSubjectName().equals(marks.get(a).getSubject().getSubjectName())) {
                atlag = atlag + marks.get(a).getMarkType().getValue();
                at = at + 1.0;
            }

        }

        double round = Math.round((atlag/at) * 100.0) / 100.0;

        return round;
    }
}
