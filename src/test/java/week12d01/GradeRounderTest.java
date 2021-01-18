package week12d01;

import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class GradeRounderTest {

    @Test
    public void TestGradeRounderCreate() {
        GradeRounder gradeRounder = new GradeRounder();

        int[] myIntArray = {34, 81, 84};

        System.out.println(Arrays.toString(gradeRounder.roundGrades(myIntArray)));
        System.out.println(Arrays.toString(gradeRounder.roundGrades2(myIntArray)));

    }



}