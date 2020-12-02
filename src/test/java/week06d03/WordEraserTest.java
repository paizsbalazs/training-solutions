package week06d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordEraserTest {

    @Test
    public void WordEraserTest() {

        WordEraser wordEraser = new WordEraser();
        System.out.println(wordEraser.eraseWorld("alma barack szolo alma dio vaj", "alma"));
        assertTrue("barack szolo dio vaj".equals(wordEraser.eraseWorld("alma barack szolo alma dio vaj", "alma")));

    }
}
