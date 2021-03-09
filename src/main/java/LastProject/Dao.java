package LastProject;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

}
