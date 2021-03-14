package LastProject;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Dao {

    private DataSource dataSource;

    public Dao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String getCityByZip(String s) {

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select city from cities where zip = ?")
            ) {
                stmt.setString(1,s);

            try (ResultSet rs = stmt.executeQuery()) {
                rs.next();
                String result = rs.getString(1);
                return result;
            } catch (SQLException sqle) {
                throw new IllegalStateException("Cannot query", sqle);
            }


        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot find");
        }

    }

    public void addCitizens(Citizens citizens) {

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("insert into citizens(citizen_name, zip, age, email, taj) values (?, ?, ?, ?, ?)")
        ) {
            stmt.setString(1,citizens.getName());
            stmt.setString(2,citizens.getZip());
            stmt.setDouble(3,citizens.getAge());
            stmt.setString(4,citizens.getEmail());
            stmt.setString(5,citizens.getTaj());

            stmt.executeUpdate();

        } catch (SQLException sqlException) {
            throw new IllegalStateException("Nem Sikerült Rögzíteni");
        }

    }

    public List<Citizens> selectForVac() {
        List<Citizens> result = new ArrayList<>();

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT citizen_id, citizen_name, zip, age, email, taj, number_of_vaccination, last_vaccination FROM citizens ORDER BY zip, age, citizen_name");
        ) {

            try (ResultSet rs = stmt.executeQuery()) {

                while (rs.next()) {
                    LocalDateTime dateTime = LocalDateTime.parse("2015-02-20T06:30:00");

                    if (rs.getString(7) == null) {
                        Citizens c = new Citizens(rs.getString(2), rs.getString(3), Integer.parseInt(rs.getString(4)), rs.getString(5), rs.getString(6), 0, dateTime );
                        result.add(c);
                    } else {
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                        dateTime = LocalDateTime.parse(rs.getString(8), formatter);
                        Citizens c = new Citizens(rs.getString(2), rs.getString(3), Integer.parseInt(rs.getString(4)), rs.getString(5), rs.getString(6),Integer.parseInt(rs.getString(7)), dateTime );
                        result.add(c);
                    }
                }


            } catch (SQLException sqle) {
                throw new IllegalStateException("Cannot query", sqle);
            }
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Üres a lakosság tábla");
        }

        return result;
    }

}
