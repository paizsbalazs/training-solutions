package week12d01;

import java.util.ArrayList;
import java.util.List;

public class GradeRounder {

    public int[] roundGrades(int[] grades) {
        List<Integer> result = new ArrayList<>();

        int f = 0;

        for (int i=0; i < grades.length; i++) {

            f = grades[i];

            if (f>40) {

            if (f%5 == 3) {
                f = f + 2;
            } else {

                if (f%5 == 4) {
                    f = f + 1;
                }

            } }

            result.add(f);

        }

        int [] ints = result.stream().mapToInt(Integer::intValue).toArray();

        return ints;
    }


    public int[] roundGrades2(int[] grades) {

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > 40) {
                int LGNO = grades[i] / 5;
                int MLGNO = (LGNO + 1) * 5;
                if (MLGNO - grades[i] < 3) {
                    grades[i] = MLGNO;
                }
            }

        }
        return grades;
    }

}
