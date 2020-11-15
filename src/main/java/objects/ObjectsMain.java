package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {


    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(book);
        String emptyBook = null;
        System.out.println(emptyBook);
        book = null;
        System.out.println(book);
        book = new Book();
        System.out.println(book);
        Book anotherbook = new Book();
        System.out.println(book == anotherbook);
        anotherbook = book;
        System.out.println(book == anotherbook);
        System.out.println(book.equals(anotherbook));
        System.out.println(anotherbook instanceof Book);

        Book[] books = {new Book(), new Book(), new Book()};

        List<Book> books1 = Arrays.asList(new Book(), new Book());

        List<Book> books2 = new ArrayList<>();
        books2.add(new Book());
        books2.add(new Book());
        books2.add(new Book());
    }
}
