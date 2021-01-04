package week10d01;

import java.util.ArrayList;
import java.util.List;

public class Hiking {

    List<Double> ma = new ArrayList<>();

    public double getPlusElevation(List<Double> m) {
        double hik = 0;
        double u = 0;

        for (int i = 1; i < m.size(); i++) {
            if (m.get(i) > m.get(i-1)) {
            hik = hik + m.get(i) - m.get(i-1);
            }
        }

        return hik;
    }
}
