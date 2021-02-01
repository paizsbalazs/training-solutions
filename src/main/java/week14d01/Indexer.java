package week14d01;

import java.util.*;

public class Indexer {

    public Map<Character, List<String>> index(List<String> names) {

        Map<Character, List<String>> result = new HashMap<>();

        for (int i = 0; i<names.size(); i++) {

            if (!result.containsKey(names.get(i).charAt(0))) {
                List<String> temp = Arrays.asList(names.get(i));
                result.put(names.get(i).charAt(0), temp);
            } else {
                List<String> temp = new ArrayList<>(result.get(names.get(i).charAt(0)));
                temp.add(names.get(i));
                result.replace(names.get(i).charAt(0), temp);
            }

        }

        return result;
    }
}
