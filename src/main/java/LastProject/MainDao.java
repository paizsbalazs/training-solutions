package LastProject;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainDao {

    public static void main(String[] args) {
        MariaDbDataSource dataSource;

        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/covid?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
        }
        catch (SQLException se) {
            throw new IllegalStateException("Can not create data source", se);
        }

        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement("select city from cities where zip = ?");
        ) {
                stmt.setLong(1,2030);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String name = rs.getString(1);
                    System.out.println(name);
                }
            } catch (SQLException sqle) {
                throw new IllegalStateException("Cannot query", sqle);
            }


        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot find");
        }
    }
}
