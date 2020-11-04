package statements;

import java.util.Scanner;

public class InvestmentMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg a befektetés összegét ");
        int fund = scanner.nextInt();

        System.out.println("Kérem adja meg a kamatlábat ");
        int interestRate = scanner.nextInt();

        Investment investment = new Investment(fund, interestRate);

        System.out.println("Hány napra számoljuk a hozamot ? ");
        int days = scanner.nextInt();

        System.out.println("Befektetés összege:");
        System.out.println(investment.getFund());
        System.out.println("Kamatláb:");
        System.out.println(investment.getInterestRate());
        System.out.println("Tőke: " + investment.getFund() );
        System.out.println("Hozzam " + days + " napra: " + investment.getYield(days) );
        System.out.println("Kivett összeg 80 nap után: " + investment.close(80));
        System.out.println("Kivett összeg 90 nap után: " + investment.close(90));
    }
}
