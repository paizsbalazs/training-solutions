package stringtype.registration;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg a felhasználónevet");
        String name = scanner.nextLine();
        System.out.println("Kérem adja meg a jelszót");
        String passw = scanner.nextLine();
        System.out.println("Kérem ismételje meg a jelszót");
        String passwRepeat = scanner.nextLine();
        System.out.println("Kérem adja meg az email címét");
        String mail = scanner.nextLine();

        UserValidator userValidator = new UserValidator(name, passw, mail);
        System.out.println(userValidator.isValidUserName(name) ? "Helyes a név" : "Helytelen a név");
        System.out.println(userValidator.isValidPassWord(passw, passwRepeat) ? "Helyes a jelszó" : "Helytelen a jelszó");
        System.out.println(userValidator.isValidEmail(mail) ? "Helyes a mail cím" : "Helytelen a mail cím");

    }
}
