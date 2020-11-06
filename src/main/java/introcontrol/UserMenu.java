package introcontrol;

import java.util.Scanner;

public class UserMenu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Felhasználó listázása");
        System.out.println("2. Felhasználó felvétele");
        System.out.println("Többi: Kilépés");
        int ut = scanner.nextInt();

        if ( ut == 1 ) {
            System.out.println("Felhasználó listázása"); }
            if ( ut == 2 ) {
                System.out.println("Felhasználó felvétele");
            }
        }


    }

