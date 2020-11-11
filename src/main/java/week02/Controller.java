package week02;

import java.util.Scanner;

public class Controller {

    private Office office;

    public static void main(String[] args) {

        Office office = new Office();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hány darab tárgyaló lesz?");
        int ig = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < ig ; i++ ) {
            System.out.println("Mi a tárgyaló neve?");
            String name = scanner.nextLine();
            System.out.println("Mekkorra a tárgyaló hossza?");
            int length = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Mekkorra a tárgyaló szélessége?");
            int width = scanner.nextInt();
            scanner.nextLine();
            MeetingRoom meetingRoom = new MeetingRoom(name, length, width);
            office.addMeetingRoom(meetingRoom);
        }

        System.out.println("1. Tárgyalók sorrendben");
        System.out.println("2. Tárgyalók visszafele sorrendben");
        System.out.println("3. Minden második tárgyaló");
        System.out.println("4. Területek");
        System.out.println("5. Keresés pontos név alapján");
        System.out.println("6. Keresés névtöredék alapján");
        System.out.println("7. Keresés terület alapján");

        int menupont = scanner.nextInt();
        scanner.nextLine();

        if ( menupont == 1 ){
            office.printNames();
        }

        if ( menupont == 2 ){
            office.printNamesReverse();
        }

        if ( menupont == 3 ){
            office.printEventNames();
        }

        if ( menupont == 4 ){
            office.getAreas();
        }

        if ( menupont == 5 ){
            System.out.println("Kérem a tárgyaló nevét");
            String name = scanner.nextLine();
            office.printMeetingRoomsWithName(name);
        }

        if ( menupont == 6 ){
            System.out.println("Kérem a tárgyaló nevének egy részét");
            String name = scanner.nextLine();
            office.printMeetingRoomsContains(name);
        }

        if ( menupont == 7 ){
            System.out.println("Kérem a szükséges tárgyaló területét");
            int size = scanner.nextInt();
            office.getAreaLargerThen(size);
        }
    }
}
