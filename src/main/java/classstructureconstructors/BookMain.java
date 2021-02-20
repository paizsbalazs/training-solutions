package classstructureconstructors;

public class BookMain {

    public static void main(String[] args) {

        Book book = new Book("1");
        book.setAuthor("TESZT SZERZŐ");
        book.setTitle("TESZT KÖNYV");

        System.out.println(book.getRegNumber() + " " + book.getAuthor() + " " +book.getTitle());
    }
}
