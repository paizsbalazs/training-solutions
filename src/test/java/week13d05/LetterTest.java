package week13d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterTest {

    @Test
    public  void testCreate() {
        Letter letter = new Letter();
        assertEquals(10, letter.getDifferentLetter("Tyronasaurus Rex"));
    }

}