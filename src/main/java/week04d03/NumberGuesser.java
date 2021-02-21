package week04d03;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {

    public static void main(String[] args) {

        int randomNumber = new Random().nextInt(100)+1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gondoltam egy számra egy és száz között, kérem a tippet!");
        int tipp = scanner.nextInt();

        while ( tipp != randomNumber ) {

            if (tipp<randomNumber) {
                System.out.println("Kisebb a tipp, mint a gondolt szám");
                System.out.println("Következő tipp!");
                tipp = scanner.nextInt();
            } else {
                System.out.println("Nagyobb a tipp, mint a gondolt szám");
                System.out.println("Következő tipp!");
                tipp = scanner.nextInt();
            }
        }

        System.out.println("A két szám megegyezik!");

    }
}
