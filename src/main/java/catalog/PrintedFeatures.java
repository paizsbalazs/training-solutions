package catalog;

import java.util.ArrayList;
import java.util.List;

public class PrintedFeatures implements Feature {

    List<String> authors = new ArrayList<>();
    private int numberOfPages;
    private String title;

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {

        if (title.equals("")) {
            throw new IllegalArgumentException("Empty title");
        }

        if (numberOfPages<=0) {
            throw new IllegalArgumentException();
        }

        if (authors==null) {
            throw new IllegalArgumentException();
        }

        this.authors = authors;
        this.numberOfPages = numberOfPages;
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public List<String> getContributors() {
        return authors;
    }

    @Override
    public String getTitle() {
        return title;
    }


}
