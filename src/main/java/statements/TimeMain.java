package statements;

import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class TimeMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hány óra van?");
        int Hour = scanner.nextInt();
        System.out.println("Hány perc van?");
        int Second = scanner.nextInt();
        System.out.println("Hány másodperc van?");
        int Minute = scanner.nextInt();

        Time time = new Time(Hour, Minute, Second);

        System.out.println("" + Hour +":"+ Minute +":"+ Second );

        System.out.println(time.getInMinutes());

        System.out.println("Hány óra van?");
        int anotherHour = scanner.nextInt();
        System.out.println("Hány perc van?");
        int anotherSecond = scanner.nextInt();
        System.out.println("Hány másodperc van?");
        int anotherMinute = scanner.nextInt();

        Time anothertime = new Time(anotherHour, anotherMinute, anotherSecond);

        System.out.println("Az első időpont " + time.getHour() + ":" + time.getMinute() + ":" + time.getSecond() + " = " + time.getInSeconds() + " perc"  );
        System.out.println("Az első időpont " + anothertime.getHour() + ":" + anothertime.getMinute() + ":" + anothertime.getSecond() + " = " + anothertime.getInSeconds() + " perc"  );
        System.out.println("Az első korábbi, mint a második: " + time.earlierThan(anothertime));

    }
}
