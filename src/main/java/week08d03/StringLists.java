package week08d03;

import java.util.ArrayList;
import java.util.List;

public class StringLists {

    public List<String> stringListUnion(List<String> first, List<String> second) {

        for (String s : first) {

            if (!second.contains(s)) {
                //System.out.println(first.get(i));
                second.add(s);
            }

        }

        return second;
    }
}
