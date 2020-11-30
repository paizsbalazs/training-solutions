package week06d01;

import java.util.ArrayList;
import java.util.List;

public class ListSelector {

    private List<String> lista = new ArrayList<>();



    public String getEvenIndexElements(List<String> lista) {
        String string = "[" + lista.get(0) + "]";

        if (lista == null) {
            throw new IllegalArgumentException("Null parameter not accepted!");
        }

        for (int i = 1; i < lista.size(); i++ ) {
            if (i%2 == 0) {
                string = string + "[" +lista.get(i) + "]";
            }
        }


        return string;
    }

}
