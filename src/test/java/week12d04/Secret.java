package week12d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Secret {

    public void printSecret(Path path) {
        try {
            byte[] bytes = Files.readAllBytes(path);
            for (byte b : bytes) {
                char c = (char) (b + 10);
                System.out.print(c);
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("CAn not read fie", ioe);
        }

    }

    public static void main(String[] args) {
        new Secret().printSecret(Path.of("secret.dat"));
    }

}
