package week12d05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Index {

    public int Index(String s) {

        int result=0;

        try {
            Path path = Path.of("Index.html");
            BufferedReader bufferedReader = Files.newBufferedReader(path);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.toUpperCase().contains("KORONAVÍRUS")) {
                    result = result + 1;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        return result;
    }
}
