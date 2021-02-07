package week14d05;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class WorldCounterTest {


    @Test
    public void TestCreate() {

            Path path = Path.of("hachiko.srt");
            WorldCounter wc = new WorldCounter();
            System.out.println(wc.countWords(path,  "Hachiko", "haza", "pályaudvar", "jó"));

    }

}