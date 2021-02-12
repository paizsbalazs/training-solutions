package week15d05;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class BattlesStatTest {

    @Test
    public void TestCreate() {

        Path path = Path.of("battles.txt");
        BattlesStat battlesStat = new BattlesStat();
        System.out.println(battlesStat.getHighestHouse(path));

    }

}