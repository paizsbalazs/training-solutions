package week04d02;

import java.util.ArrayList;
import java.util.List;

public class Search {

    public List<Integer> getIndexesOfChar(String s, Character c) {
        List<Integer> result = new ArrayList<>();
        char[] a = s.toCharArray();

        for (int i = 0; i < a.length; i++) {
            if (c==a[i]) {
                result.add(i);
            }
        }

        return result;
    }

}
