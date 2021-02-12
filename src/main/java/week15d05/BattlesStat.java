package week15d05;

import week15d02.Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BattlesStat {

    private Map<String, Integer> battles = new HashMap<>();

    public Map<String, Integer> getBattles() {
        return battles;
    }

    public void readFromFile(Path path) {
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;

            while ((line = br.readLine()) != null) {
                for (int i = 5; i<13; i++) {
                    if (!battles.containsKey(line.split(",")[i])) {
                        if (!line.split(",")[i].equals("")) {
                            battles.put(line.split(",")[i], 0);
                        }
                    }
                    if (!line.split(",")[i].equals("")) {
                        battles.put(line.split(",")[i], battles.get(line.split(",")[i]) + 1);
                    }
                }

            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file", ioe);
        }

    }

    public String getHighestHouse(Path path) {
        String result = "Test";
        int max = 0;
        readFromFile(path);

        for (Map.Entry<String, Integer> me: battles.entrySet()) {
            if (me.getValue()>max) {
                max = me.getValue();
                result = me.getKey() + ":" + max;
            }
        }
        return result;
    }


}
