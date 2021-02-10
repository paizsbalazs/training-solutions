package week15d03;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostFinderTest {

    @Test
    void findPostsFor() {

        Post post = new Post("CIM1", LocalDate.parse("2021-01-01"), "TARTALOM1", "TULAJ1");
        Post post1 = new Post("CIM1", LocalDate.parse("2021-09-01"), "TARTALOM1", "TULAJ1");
        Post post2 = new Post("CIM1", LocalDate.parse("2021-02-01"), "TARTALOM1", "TULAJ1");
        Post post3 = new Post("CIM1", LocalDate.parse("2021-01-01"), "TARTALOM1", "TULAJ2");
        Post post4 = new Post("CIM1", LocalDate.parse("2021-01-01"), "TARTALOM1", "TULAJ3");

        List<Post> posts = new ArrayList<>();
        posts.add(post);
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        posts.add(post4);

        PostFinder pf = new PostFinder(posts);
        System.out.println(pf.findPostsFor("TULAJ1"));
    }
}