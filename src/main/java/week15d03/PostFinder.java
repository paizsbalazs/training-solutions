package week15d03;

import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PostFinder {

    private List<Post> posts;

    public PostFinder(List<Post> posts) {
        this.posts = posts;
    }

    public List<Post> findPostsFor(String user) {
        List<Post> result = new ArrayList<>();

        for (Post p: posts) {
            if (p.getOwner().equals(user) & !p.getContent().equals("") & !p.getTitle().equals("") & p.getPublishedAt().isBefore(LocalDate.now())) {
                result.add(p);
            }
        }

        return result;
    }
}
