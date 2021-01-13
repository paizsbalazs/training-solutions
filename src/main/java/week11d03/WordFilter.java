package week11d03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordFilter {

    public List<String> WordFilter(List<String> words, char c){
        List<String> results = new ArrayList<>();

        for (String s: words ) {

            if (s.indexOf(c)>=0) {
                results.add(s);
            }

        }

        return results;
    }
}
