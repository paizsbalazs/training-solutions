package week11d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordfilterTest {

    @Test
    public void WordfilterTestCreate() {

        List<String> words = new ArrayList<>();
        words.add("abc");
        words.add("bcd");
        words.add("abd");
        WordFilter wordFilter = new WordFilter();
        assertEquals("[abc, bcd]", wordFilter.WordFilter(words, "c".charAt(0)));

    }
}
