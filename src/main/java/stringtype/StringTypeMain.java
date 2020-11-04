package stringtype;

import week02.Product;

public class StringTypeMain {

    public static void main(String[] args) {

        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;
        message = message + 444;

        boolean b = message.equals("Hello John Doe");

        boolean c = message.equals("Hello John Doe444");

        System.out.println(b);
        System.out.println(c);

        String sample = "Abcde";

        System.out.println(sample.length());
        System.out.println(sample.charAt(0) + " , " + message.charAt(2));
        System.out.println(sample.substring(0, 2));

    }
}
