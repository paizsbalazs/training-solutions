package week13d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {

    @Test
    public void TestCreate() {
        Teacher teacher = new Teacher();
        System.out.println(teacher.getTeacherClassNumber("Csincsilla Csilla"));
    }

}