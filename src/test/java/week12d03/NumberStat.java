package week12d03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberStat {

    private List<Integer> szamok = new ArrayList<Integer>();
    private List<NumberCount> eredemenyek = new ArrayList<>();

    public NumberStat(List<Integer> szamok) {

        if (szamok.size()<=0) {
            throw new IllegalArgumentException("Üres a lista");
        }

        this.szamok = szamok;
    }

    public int getOne() {
        int count = 0;

        List<Integer> sortedNumbers = new ArrayList<>(this.szamok);
        Collections.sort(sortedNumbers);

        for (int i=0; i < sortedNumbers.size(); i++) {

            int j = i;

            while (sortedNumbers.get(i) == sortedNumbers.get(j)) {
                    count = count + 1;
                    j = j + 1;
            }

            eredemenyek.add(new NumberCount(sortedNumbers.get(i), count));
            count = 0;
            i = i + (j-1);

        }

        int result=eredemenyek.get(0).getDarab();

        for (NumberCount h: eredemenyek) {

            if (h.getDarab()<result) {
                result = h.getSzam();
            }


        }

        return result;
    }

}
