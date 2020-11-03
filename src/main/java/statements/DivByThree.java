package statements;

import java.util.Scanner;

public class DivByThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy egész számot");
        int a = scanner.nextInt();

        boolean x = a % 3 == 0;
        System.out.println("Ez a szám oszható hárommal : " + x );
    }
}
