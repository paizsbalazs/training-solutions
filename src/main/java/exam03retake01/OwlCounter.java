package exam03retake01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class OwlCounter {

    private Map<String, Integer> data = new HashMap<>();


    public void fileReadToMap(Path path) {
        try (BufferedReader br = Files.newBufferedReader(path)) {
            readFromFile(br);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't find file.", ioe);
        }
    }

    public void readFromFile(BufferedReader br) {
        try {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                readFromLine(line);
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("File read error");
        }
    }

    public void readFromLine(String line) {
        String field[] = line.split("=");

        if (!data.keySet().contains(field[0])) {
            data.put(field[0], Integer.parseInt(field[1]));
        }
    }

    public int getNumberOfOwls(String s) {
        return data.get(s);
    }
}
