package LastProject;

import org.mariadb.jdbc.MariaDbDataSource;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {


    public List<Citizens> readLines(BufferedReader reader) throws IOException {
        List<Citizens> result = new ArrayList<>();
        String line;
        line = reader.readLine();
        while ((line = reader.readLine())  != null) {
        String[] sor = line.split(";");
          result.add(new Citizens(sor[0], sor[1], Integer.parseInt(sor[2]), sor[3], sor[4]));
        }
        return result;
    }

    public void writeLines(List<Citizens> citizens, BufferedWriter writer) {
        int counter = 7;
        String min = ":30";
        try {
            writer.write("Időpont;Név;Irányítószám;Életkor;E-mail cím;TAJ szám"+ "\r\n");

            for (Citizens c : citizens) {

                if (min.equals(":00")) {
                    min = ":30";
                } else {
                    min = ":00";
                    counter = counter + 1;
                }

                writer.write(counter + min +";"+ c.getName() +";"+ c.getZip() +";"+ c.getAge() +";"+ c.getEmail() +";"+ c.getTaj() + "\r\n");

            }



        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

}
