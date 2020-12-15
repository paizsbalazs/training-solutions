package week08d02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

    public List<Integer> getNumbers(int interval, int numbers) {
        Random random = new Random(5);
        List<Integer> nyero = new ArrayList<>();
        Integer nyeroszam;

        for (int i = 0; i < numbers; i++) {

            nyeroszam = random.nextInt(interval)+1;
            //nyeroszam = (int) (Math.random() * interval) + 1;

            while (nyero.contains(nyeroszam)) {
                nyeroszam = random.nextInt(interval)+1;
                //nyeroszam = (int) (Math.random() * interval) + 1;
            }

            nyero.add(nyeroszam);
        }


        return nyero;
    }
}
