package week02d04;

import java.lang.reflect.Array;
import java.util.Scanner;

public class InputNames {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] arrayOfNames = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Kérem szépen az első nevet");
            arrayOfNames[i] = scanner.nextLine();

        }

        for (int i = 0; i < 5; i++) {
            System.out.println(arrayOfNames[i]);

        }
    }

}
