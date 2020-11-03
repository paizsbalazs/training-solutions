package week02;

import java.util.Scanner;

public class PhoneMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mi típus?");
        String tip = scanner.nextLine();

        System.out.println("Mekorra a memoria?");
        int tarh = scanner.nextInt();

        Phone phone = new Phone(tip, tarh);

        System.out.println("Mi típus?");
        String tip2 = scanner.nextLine();

        System.out.println("Mekorra a memoria?");
        int tarh2 = scanner.nextInt();

        Phone anotherphone = new Phone(tip2, tarh2);

        System.out.println(phone.getType());
        System.out.println(anotherphone.getType());

    }
}
