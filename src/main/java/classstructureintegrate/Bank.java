package classstructureintegrate;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Milyen néven szertné megnyitni a bankszámlaszám1 - et?");
        String name1 = scanner.nextLine();

        System.out.println("Mi lesz a bankszámlaszám1?");
        String bnkszla1 = scanner.nextLine();

        System.out.println("Mi lesz a bankszámlaszám1 nyitóegyenlege?");
        Integer nyito1 = scanner.nextInt();

        BankAccount bankAccount = new BankAccount(bnkszla1,name1, nyito1);

        System.out.println("Milyen néven szertné megnyitni a bankszámlaszám2 - et?");

        String name2 = scanner.nextLine();

        System.out.println("Mi lesz a bankszámlaszám2?");
        String bnkszla2 = scanner.nextLine();

        System.out.println("Mi lesz a bankszámlaszám2 nyitóegyenlege?");
        Integer nyito2 = scanner.nextInt();

        BankAccount anotherbankAccount = new BankAccount(bnkszla2,name2, nyito2);

        System.out.println(bankAccount.getInfo());
        System.out.println(anotherbankAccount.getInfo());

        System.out.println("Mennyit szeretne befizetni?");
        Integer depamount = scanner.nextInt();
        bankAccount.deposit(depamount);
        System.out.println(bankAccount.getInfo());

        System.out.println("Mennyit szeretne Kivenni?");
        Integer wamount = scanner.nextInt();
        anotherbankAccount.withdraw(wamount);
        System.out.println(bankAccount.getInfo());
        System.out.println(anotherbankAccount.getInfo());

        System.out.println("Mennyit szeretne Utalni?");
        Integer pamount = scanner.nextInt();
        bankAccount.transfer(anotherbankAccount, pamount);

        System.out.println(bankAccount.getInfo());
        System.out.println(anotherbankAccount.getInfo());
    }
}
