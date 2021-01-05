package week10d02;

import java.util.List;

public class MaxTravel {

    public int getMaxIndex(List<Integer> emberek) {

        int result=0;
        int[] myIntArray = new int[30];

        for (int i=0; i < emberek.size(); i++ ) {
            myIntArray[emberek.get(i)] = myIntArray[emberek.get(i)] + 1;
        }

        int max = 0;

        for (int j=0; j < myIntArray.length; j++) {

            if (max<myIntArray[j]) {
                result = j;
                max = myIntArray[j];
            }
        }

        return result;
    }
}
