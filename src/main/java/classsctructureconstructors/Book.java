package classsctructureconstructors;

public class Book {

    private String author;
    private String title;
    private String regNumber;

    public String getAuthor() {
        return author;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Book(String regNumber) {
        this.regNumber = regNumber;
    }

}
