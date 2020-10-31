package classstructureattributes;

import java.util.Scanner;

public class client {

    String name;
    Integer yearOfBirth;
    String address;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        client client = new client();
        System.out.println("Hello kérlek adj meg egy Nevet");
        client.name = scanner.nextLine();
        System.out.println("Adja meg a címét!");
        client.address = scanner.nextLine();
        System.out.println("Adj meg egy Születési évet");
        client.yearOfBirth = scanner.nextInt();



        System.out.println(client.name + " , " + client.yearOfBirth + " született, és most " + client.address + " lakik.Jó öreg, hiszen" + (2020 - client.yearOfBirth) + " éves." );

    }

}
