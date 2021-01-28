package week13d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TemplateMerger {

    public String merge(Path file, List<Employee> employees) {
        String template;

        try (BufferedReader br = Files.newBufferedReader(file)) {
            template = br.readLine();
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file", ioe);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i<employees.size(); i++) {
            sb.append(this.getTemplateString(template, employees.get(i).getName(), employees.get(i).getYearOfBirth())).append("\n");
        }

        return sb.toString();
    };

    public String getTemplateString(String template, String name, int boy) {

        String boys = Integer.toString(boy) + "";
        String etemplate = template.replace("{nev}", name).replace("{ev}", boys );

        return etemplate;
    }

}
