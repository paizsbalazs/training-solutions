package schoolrecords;

import objects.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

    private String className;
    Random rnd = new Random();
    private List<Student> students= new ArrayList<>();

    public ClassRecords(String className, Random rnd, List<Student> students) {
        this.className = className;
        this.rnd = rnd;
        this.students = students;
    }

    public ClassRecords(String className, Random rnd) {
        this.className = className;
        this.rnd = rnd;
    }

    public boolean addStudent(Student student) {
            boolean boo = true;

        if ( !students.contains(student.getName()) ) {
            this.students.add(student);
            boo = true;
        }

        for (int k = 0; k < this.getStudents().size(); k++) {
            System.out.println(this.getStudents().toString());
        }

        return boo;
    }

    public String getClassName() {
        return className;
    }

    public List<Student> getStudents() {
        return students;
    }

    public boolean removeStudent(Student del) {

        Boolean result=false;

        for (int i = 0; i<this.students.size(); i++) {

            if (students.get(i).getName().equals(del.getName())) {
                this.students.remove(i);
                result = true;

            }

        }

        return result;
    }

    public double calculateClassAverage() {
        double result=0;
        int i;

        if (this.students.size()==0) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }

        for (i = 0; i<this.students.size(); i++) {

            result += this.students.get(i).calculateAverage();

        }

        return result/i;
    }

    public double calculateClassAverageBySubject(Subject s) {
        double result = 0.0;
        int i;
        int j=0;

        if (this.students.size()==0) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }

        for (i = 0; i<this.students.size(); i++) {

            result += this.students.get(i).calculateSubjectAverage(s);

            if (this.students.get(i).calculateSubjectAverage(s)==0) {

            } else {
                j = j + 1;
            }

        }

        return result/j;
    }

    public Student findStudentByName(String name) {

        if (name.equals("")) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }

        if (this.students.size()==0) {
            throw new IllegalStateException("No students to search!");
        }

        for (Student s: this.students) {

            if (s.getName().equals(name)) {
                return s;
            }

        }

        throw new IllegalArgumentException("Student by this name cannot be found! " + name);

    }

    public Student repetition() {

        if (this.students.size()==0) {
            throw new IllegalStateException("No students to select for repetition!");
        }

        Random rand = new Random();

        return students.get(rand.nextInt((students.size()-1) - 0 + 1) + 0);

    }

    public List<StudyResultByName> listStudyResults() {
        List<StudyResultByName> result = new ArrayList<>();

        for (Student s: students) {
            result.add(new StudyResultByName(s.getName(), s.calculateAverage()));
        }

        return result;
    }

    public StringBuilder listStudentNames() {
        StringBuilder result = new StringBuilder();

        for (Student s: this.students) {
            result.append(s.getName() + ", ");
        }

        result = result.delete(result.length()-2, result.length());

        return result;
    }

}
