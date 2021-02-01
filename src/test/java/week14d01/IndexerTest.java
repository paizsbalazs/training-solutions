package week14d01;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class IndexerTest {

    @Test
    public void TestCreate() {

        Indexer indexer = new Indexer();
        System.out.println(indexer.index(Arrays.asList("Tibor", "Teri", "Feri", "Aladar")));

    }

}