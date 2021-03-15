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

                    if (rs.getString(7) == null)  {
                        Citizens c = new Citizens(rs.getString(2), rs.getString(3), Integer.parseInt(rs.getString(4)), rs.getString(5), rs.getString(6), 0, dateTime );
                        result.add(c);
                    } else {
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

    public int getCitizenByTaj(String s) {

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from citizens where taj = ?")
        ) {
            stmt.setString(1,s);

            try (ResultSet rs = stmt.executeQuery()) {
                rs.next();
                if (Integer.parseInt(rs.getString(1)) > 0 ) {
                    return Integer.parseInt(rs.getString(1));
                } else {
                 return 0;
                }

            } catch (SQLException sqle) {
                throw new IllegalStateException("Cannot query", sqle);
            }


        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot find");
        }

    }

    public int numberOfOltas(int citizen_id) {
        int numberOfOltas = 0;

        try (Connection conn = dataSource.getConnection();

             PreparedStatement stmt3 = conn.prepareStatement("select citizen_id, number_of_vaccination from citizens WHERE citizen_id=?")

        ) {

            stmt3.setInt(1,citizen_id);

            try (ResultSet rs = stmt3.executeQuery()) {
                rs.next();
                numberOfOltas = Integer.parseInt(rs.getString(2));
            }
            catch (SQLException sqle2) {
                throw new IllegalStateException("Cannot query citizen", sqle2);
            }

        } catch (SQLException sqlException) {
            new IllegalStateException("NEm találom a partnert");
        }
        return numberOfOltas;
    }

    public void addVaccination(String date, String vacc_type, int citizen_id) {

        try (Connection conn = dataSource.getConnection();

             PreparedStatement stmt2 = conn.prepareStatement("UPDATE citizens SET number_of_vaccination=?, last_vaccination='2020.01.01' WHERE citizen_id=?;")
        ) {
            conn.setAutoCommit(false);

            if (numberOfOltas(citizen_id)==1) {
                stmt2.setInt(1,2);
            } else {
                stmt2.setInt(1,1);
            }

            stmt2.setInt(2,citizen_id);
            int r = stmt2.executeUpdate();

            try (PreparedStatement stmt = conn.prepareStatement("insert into vaccination(citizen_id, vaccination_date, vaccination_status, note, vaccination_type) values (?, ?, ?, ?, ?)");) {

                stmt.setInt(1,citizen_id);
                stmt.setString(2,date);
                stmt.setString(3,"ok");
                stmt.setString(4,"");
                stmt.setString(5,vacc_type);
                int r2 = stmt.executeUpdate();

                if ((r<=0) | (r2<=0)) {
                    throw new IllegalArgumentException("Nem regisztárlt partner");
                }


            } catch (IllegalArgumentException illegalArgumentException) {
                conn.rollback();
            }

            conn.commit();
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Nem Sikerült Rögzíteni");
        }

    }

}
