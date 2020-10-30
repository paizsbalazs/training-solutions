package classstructureio;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello kérlek adj meg egy számot");
        int a = scanner.nextInt();
        System.out.println("Hello adj meg még egy számot");
        int b = scanner.nextInt();
        System.out.println(a + "+" + b + "!");
        System.out.println(a + b);
    }
}
