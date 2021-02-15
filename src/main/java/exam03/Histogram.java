package exam03;

import week15d02.Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Histogram {

    public String createHistogram(BufferedReader reader) {
        StringBuilder sb = new StringBuilder();
        String line;

        try {
            while ((line = reader.readLine()) != null) {
                for (int i = 0; i<Integer.parseInt(line); i++) {
                    sb.append("*");
                }
                sb.append("\n");
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("File read error");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Path path = Path.of("histogram.txt");
        try (BufferedReader br = Files.newBufferedReader(path)) {
            Histogram histogram = new Histogram();
            System.out.println(histogram.createHistogram(br));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file", ioe);
        }
    }

}
