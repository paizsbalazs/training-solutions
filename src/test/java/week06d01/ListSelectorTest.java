package week06d01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListSelectorTest {

    @Test
    public void getEvenIndexElementsCreate() {

        ListSelector listSelector = new ListSelector();

        List<String> lista = new ArrayList<>();
        lista.add("Korte");
        lista.add("Alma");
        lista.add("Tonik");
        lista.add("Barack");

        assertEquals("[Korte][Tonik]", listSelector.getEvenIndexElements(lista));

    }
}
