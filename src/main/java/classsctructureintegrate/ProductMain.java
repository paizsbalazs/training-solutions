package classsctructureintegrate;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {
        System.out.println("Kérem adja meg a termék nevét");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Kérem adja meg a termék árát");
        Integer price = scanner.nextInt();

        Product product = new Product(name, price);
        System.out.println(product.getName() + " " + product.getPrice() + " Ft");

        System.out.println("Kérem adja meg mennyivel emeljük termék árát");
        Integer iprice = scanner.nextInt();
        product.increasePrice(iprice);
        System.out.println("A" + product.getName() + " új ára: " + product.getPrice());

        System.out.println("Kérem adja meg mennyivel csökkentsük termék árát");
        Integer dprice = scanner.nextInt();
        product.decreasePrice(dprice);
        System.out.println("A" + product.getName() + " új ára: " + product.getPrice());

    }
}
