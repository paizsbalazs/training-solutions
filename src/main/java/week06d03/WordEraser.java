package week06d03;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordEraser {

    public String eraseWorld(String words, String word) {
        String nstring = "";

        String[] wordst = words.split(" ");
        List<String> wordsl = Arrays.asList(wordst);
        List<String> wordsf = new ArrayList<>(wordsl);

        for (int i = 0; i < wordsl.size(); i++) {
            if ( !word.equals(wordsf.get(i))) {
                nstring = nstring + " " + wordsf.get(i);
            }
        }

        return nstring.trim();
    }
}
