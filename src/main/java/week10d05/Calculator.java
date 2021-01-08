package week10d05;

import java.util.Arrays;

public class Calculator {

    public int findMinSum(int[] szamok) {
        int result=0;

        Arrays.sort(szamok);

        for (int i= 0; i <= 3; i++ ) {
            result = result + szamok[i];
        }

        return result;
    }
}
