package introcontrol;

import java.util.Scanner;

public class BoatRental {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hányan vagytok?");
        int letszam = scanner.nextInt();

        int szabadhely = 10;
        int szabadhajo = 3;

        if ( letszam > 3 ) {
            System.out.println("Ötös hajó");
            letszam = letszam - 5;
            szabadhely = szabadhely - 5;
            szabadhajo = szabadhajo - 1;
        }

        if ( letszam > 2 ) {
            System.out.println("hármas hajó");
            letszam = letszam - 3;
            szabadhely = szabadhely - 3;
            szabadhajo = szabadhajo - 1;
        }

        if ( letszam > 0 )  {
            System.out.println("kettes hajó");
            letszam = letszam - 2;
            szabadhely = szabadhely - 2;
            szabadhajo = szabadhajo - 1;
        }

        if ( letszam > 0 ) {
            System.out.println(letszam + " a parton marad");
        }   else    {
            System.out.println("Szabad hely: " + szabadhely);
            System.out.println("Szabad hajó: " + szabadhajo);
        }

    }
}
