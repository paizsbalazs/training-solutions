package week05d03;

import java.util.Arrays;
import java.util.List;

public class ListCounter {


    public int getNumberA(List<String> words) {
        int count = 0;

        for (String szo : words) {
            if ( szo.startsWith("A") || szo.startsWith("a")) {
                count = count + 1;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        ListCounter listCounter = new ListCounter();
        List<String> szavak = Arrays.asList("Alma", "alma", "Ter", "villmaos");
        System.out.println(listCounter.getNumberA(szavak));


    }
}
