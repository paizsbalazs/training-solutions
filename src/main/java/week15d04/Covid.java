package week15d04;

import org.w3c.dom.stylesheets.LinkStyle;
import week15d02.Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Covid {

    private List<CovidData> datas = new ArrayList<>();

    public List<CovidData> getDatas() {
        return datas;
    }

    public List<CovidData> readFromFile(Path path) {
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line = br.readLine();

            while ((line = br.readLine()) != null) {

                if (line.split(",")[4].equals("Hungary")) {
                    String date = line.split(",")[0];
                    String yearweek = line.split(",")[1];
                    int cases = Integer.parseInt(line.split(",")[2]);
                    datas.add(new CovidData(date, yearweek, cases));
                }

            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file", ioe);
        }
        return getHighestInHungary();
    }

    public List<CovidData> getHighestInHungary() {
        Collections.sort(datas);
        List<CovidData> result = new ArrayList<>();

        result.add(datas.get(0));
        result.add(datas.get(1));
        result.add(datas.get(2));

        Collections.sort(result);

        return result;
    }

    @Override
    public String toString() {
        return "Covid{" +
                "datas=" + datas +
                '}';
    }
}
