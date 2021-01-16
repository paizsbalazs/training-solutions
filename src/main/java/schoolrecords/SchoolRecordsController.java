package schoolrecords;

import java.awt.*;
import java.util.List;
import java.util.Scanner;

public class SchoolRecordsController {

    private int id;
    private String id_name;

    public SchoolRecordsController(int id, String id_name) {
        this.id = id;
        this.id_name = id_name;
    }

    private List<SchoolRecordsController> menu;

    public static void main(String[] args) {

        for (int d = 0; d < 11; d++) {
            SchoolRecordsController schoolRecordsController = new SchoolRecordsController(d,"Diákok nevének listázása");
            //new.menu.add(schoolRecordsController);
        }


        Scanner scanner = new Scanner(System.in);
        int i = 0;

            while (i!=11) {
                System.out.println("1. Diákok nevének listázása");
                System.out.println("2. Diák név alapján keresése");
                System.out.println("3. Diák létrehozása");
                System.out.println("4. Diák név alapján törlése");
                System.out.println("5. Diák feleltetése");
                System.out.println("6. Osztályátlag kiszámolása");
                System.out.println("7. Tantárgyi átlag kiszámolása");
                System.out.println("8. Diákok átlagának megjelenítése");
                System.out.println("9. Diák átlagának kiírása");
                System.out.println("10. Diák tantárgyhoz tartozó átlagának kiírása");
                System.out.println("11. Kilépés");

            }


    }

}
