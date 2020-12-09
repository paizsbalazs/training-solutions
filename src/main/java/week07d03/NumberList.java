package week07d03;

import java.util.List;

public class NumberList {

    public boolean isIncreasing(List<Integer> szamok) {
        int elozoszam = szamok.get(0);

        for (int i = 0; i < szamok.size(); i++) {

            if (elozoszam > szamok.get(i)) {
                return false;
            }

            elozoszam = szamok.get(i);

        }
        return true;
    }
}
