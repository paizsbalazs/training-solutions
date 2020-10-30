package classstructureio;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjon meg egy felhasználói nevet!");
        String name = scanner.nextLine();
        System.out.println("Adjon meg egy mail címet!");
        String mail = scanner.nextLine();
        System.out.println(name + " " +mail);



    }
}
