package LastProject;

import org.mariadb.jdbc.MariaDbDataSource;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

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
                if (!bnc.isEmpty()) {
                    System.out.println(dao.getCityByZip(bnc));
                } else {
                    throw new IllegalStateException("Üres az irányítószám");
                }
                System.out.println("Kérem adja meg az életkort:");
                String bnage = sc.nextLine();
                if ( ( Integer.parseInt(bnage) < 10 ) & ( Integer.parseInt(bnage) < 150  ) & (bnage.isEmpty()) ){
                    throw new IllegalStateException("Hibás a kor");
                }
                System.out.println("Kérem adja meg az email címét:");
                String bnmail = sc.nextLine();
                if (!(bnmail.contains("@"))|(bnmail.length()<3)) {
                    throw new IllegalStateException("Hibás mail cím");
                }
                System.out.println("Kérem adja meg az email címét újra:");
                String bnmail2 = sc.nextLine();
                if (!bnmail.equals(bnmail2)) {
                    throw new IllegalStateException("Hibás mail cím");
                }
                System.out.println("Kérem adja meg a TAJ számot");
                String taj = sc.nextLine();
                int result=0;
                char[] tajt = taj.toCharArray();

                for (int i = 0; i< tajt.length; i++) {
                    if (i%2==0) {
                        result = result + ((Character.getNumericValue(tajt[i]))*7);
                    } else {
                        result = result + ((Character.getNumericValue(tajt[i]))*3);
                    }
                }

                if (result%10==Character.getNumericValue(tajt[9])) {

                } else {
                    throw new IllegalStateException("Hibás adószám");
                }
                dao.addCitizens(new Citizens(bn, bnc, Integer.parseInt(bnage), bnmail, taj));
                break;
            case 2:
                try (BufferedReader reader = Files.newBufferedReader(Path.of("citizens.txt"))) {
                    List<Citizens> citizens = new FileReader().readLines(reader);

                    for (int i = 0; i<citizens.size(); i++) {
                        dao.addCitizens(citizens.get(i));
                    }

                } catch (IOException ioe) {
                    throw new IllegalStateException("Can not read file", ioe);
                }

            break;
            case 3:

                List<Citizens> citizens = dao.selectForVac();

                try (BufferedWriter writer = Files.newBufferedWriter(Path.of("oltas.csv"))) {

                    new FileReader().writeLines(citizens, writer);

                } catch (IOException ioe) {
                    throw new IllegalStateException("Can not read file", ioe);
                }

                System.out.println(dao.selectForVac().size());

                break;
            case 4:
                System.out.println("Kérem adja meg a beteg Taj számát:");
                String bntaj = sc.nextLine();

                if (dao.getCitizenByTaj(bntaj)<1) {
                    throw new IllegalStateException("NEm regisztált TAJ szám"); } else {
                    System.out.println("Kérem adja meg a dátumot:");
                    String bndat = sc.nextLine();
                    System.out.println("Kérem adja meg az oltás típusát:");
                    String bntypv = sc.nextLine();
                    dao.addVaccination(bndat, bntypv, dao.getCitizenByTaj(bntaj));
                }
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                List<Citizens> citizens2 = dao.selectForVac();
                Map<String, List<Citizens>> report = new HashMap<>();
                List<Citizens> buffer = new ArrayList<>();

                for (Citizens c:citizens2) {

                    if (!report.containsKey(c.getZip())) {
                        report.put(c.getZip(), buffer);
                    }
                    List<Citizens> c2 = new ArrayList<>(report.get(c.getZip()));
                    c2.add(c);
                    report.put(c.getZip(), c2);
                }

                System.out.println(report.toString());

                for (String s: report.keySet()) {
                    int nulla = 0;
                    int egy = 0;
                    int tobb = 0;

                    for (int i = 0; i<report.get(s).size(); i++) {
                        if (report.get(s).get(i).getNumber_of_vaccination()==0) {
                            nulla = nulla + 1;
                        } else {
                            if (report.get(s).get(i).getNumber_of_vaccination()==1) {
                                egy = egy + 1;
                            } else {
                                tobb = tobb + 1;
                            }
                        }
                    }

                    System.out.println("A " + s + " irányítószámon, oltatlan ember:" + nulla + " , egys oltással rendelkező ember:" + egy + " , és több oltással rendelkező ember:" + tobb + " van" + "\r\n");

                }
                break;
        }

    }

}
