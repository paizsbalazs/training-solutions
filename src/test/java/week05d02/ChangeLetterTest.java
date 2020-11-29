package week05d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChangeLetterTest {

    @Test
    public void ChangeLetterTestCreate () {
        ChangeLetter changeLetter = new ChangeLetter();
        assertTrue("T*r*f*r*t*p*csÉk*r".equals(changeLetter.changeLetter("TarefurotUpIcsÉkEr")));
    }
}
