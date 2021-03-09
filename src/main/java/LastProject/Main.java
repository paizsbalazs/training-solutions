package LastProject;

import org.mariadb.jdbc.MariaDbDataSource;
import org.mariadb.jdbc.MySQLDataSource;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

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

        Dao dao = new Dao(dataSource);

        Scanner sc = new Scanner(System.in);
        System.out.println("1. Regisztráció");
        System.out.println("2. Tömeges regisztráció");
        System.out.println("3. Generálás");
        System.out.println("4. Oltás");
        System.out.println("5. Oltás meghiúsulás");
        System.out.println("6. Riport");
        String mp = sc.nextLine();

        switch (Integer.parseInt(mp)) {
            case 1:
                System.out.println("Kérem adja meg a beteg nevét:");
                String bn = sc.nextLine();
                if (bn.equals("")) {
                    throw new IllegalStateException("Üres név");
                }
                System.out.println("Kérem adja meg az irányítószámot:");
                String bnc = sc.nextLine();
                if (!bnc.equals("")) {
                    System.out.println(dao.getCityByZip(bnc));
                }
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }

    }

}
