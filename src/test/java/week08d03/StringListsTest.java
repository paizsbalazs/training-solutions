package week08d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringListsTest {

    @Test
    public void StringListsTestCreate() {
        StringLists stringLists = new StringLists();
        List<String> first = new ArrayList<String>(Arrays.asList("Alam", "Korte", "Banan"));
        List<String> second = new ArrayList<String>(Arrays.asList("Alam", "Alma", "Teve"));
        assertEquals(Arrays.asList("Alam", "Alma", "Teve", "Korte", "Banan"), stringLists.stringListUnion(first, second));

    }
}
