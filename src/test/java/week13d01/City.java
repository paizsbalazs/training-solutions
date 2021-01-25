package week13d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class City {

    public String getLongestNameCity() {
        int length = 0;
        String result = "";

        Path path = Path.of("iranyitoszamok-varosok-2021.csv");

        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {

                String[] arrOfStr = line.split(";", 3);

                if (arrOfStr[1].length()>length) {
                    result = arrOfStr[1];
                    length = arrOfStr[1].length();
                }

            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file", ioe);
        }

        return result;
    }
}
