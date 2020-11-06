package introcontrol;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        for ( int i = 0 ; i < 5 ; i++ ) {


            System.out.println("Kérem a számot");
            int number = scanner.nextInt();
            sum += number;
        }

        System.out.println(sum);

    }
}
