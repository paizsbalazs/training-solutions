package classstructureattributes;

import java.util.Scanner;

public class Music {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Song song = new Song();
        System.out.println("Kérem kedves felhasználó, adja meg a kedvenc számának az előadóját!");
        song.band = scanner.nextLine();
        System.out.println("Kérem kedves felhasználó, adja meg a kedvenc számának a címét!");
        song.title = scanner.nextLine();
        System.out.println("Kérem kedves felhasználó, adja meg a kedvenc számának a hosszát percben!");
        song.length = scanner.nextInt();

       // System.out.println("Kedves felhasználó, az ön kedvenc számát aminek a címe " + song.title + ". A dalt a" + song.band + " adta elő, " + song.length + " percben.");

        System.out.println(song.band + " - " + song.title + " (" + song.length + " perc)!");

    }
}
