package week02;

import java.util.Scanner;

public class PhoneMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Phone phone = new Phone("Nokia 3310", 22);
        Phone anotherphone = new Phone("Nokia 6510", 23);

        System.out.println(phone.getType());
        System.out.println(anotherphone.getType());

    }
}
