package week13d05;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Letter {

    public int getDifferentLetter(String word) {
        String word2 = word.toLowerCase();
        char a = 'a';
        char b = 'z';

        List<Character> words = new ArrayList<>();

        for (int i = 0; i<word2.length(); i++) {

            char j = word2.charAt(i);

            if (!words.contains(j) && (a <= j) && (j <= b)) {
                words.add(word2.charAt(i));
            }
        }
        return words.size();
    }


}
