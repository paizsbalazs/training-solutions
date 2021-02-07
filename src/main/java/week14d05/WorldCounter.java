package week14d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class WorldCounter {

    public Map<String, Integer> countWords(Path path, String ...words) {
        Map<String, Integer> result = new HashMap<>();
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;

            while ((line = br.readLine()) != null) {

                for (int i = 0; i < words.length; i++) {
                    if (line.contains(words[i])) {
                        if (result.containsKey(words[i])) {
                            int count = result.get(words[i]);
                            result.replace(words[i], count+1);
                        } else {
                            result.put(words[i], 0);
                        }
                    }
                }

            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file", ioe);
        }

        return result;
    }

    private Map<String, Integer> LoadMap(String[] words) {
        Map<String, Integer> result = new HashMap<>();
        for(String word: words) {
            result.put(word, 0);
        }
        return result;
    }

}
