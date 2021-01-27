package week13d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Teacher {

    public int getTeacherClassNumber(String teacher) {
        int result = 0;

        Path path = Path.of("beosztas.txt");

        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {

                if (line.equals(teacher)) {
                    br.readLine();
                    br.readLine();
                    result = result + Integer.parseInt(br.readLine());
                } else {
                    br.readLine();
                    br.readLine();
                    br.readLine();
                }

            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file", ioe);
        }
        return result;
    }
}
