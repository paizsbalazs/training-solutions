package week11d04;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesSum {

    public int sumNumbers() {
        int result=0;

        for (int i=0; i<=99; i++) {

            if (Files.isRegularFile(Path.of("number"+i+".txt"))) {
                result = result + this.fileBolOsszeg("number"+i+".txt");
            };

        }

        return result;
    }

    public int fileBolOsszeg(String s) {
        int result2=0;
        try {
            result2 = Integer.parseInt(new String(Files.readString(Path.of(s))));
        } catch (IOException e) {
            throw new IllegalArgumentException("Can not read, e");
        }
        return result2;
    }


}
