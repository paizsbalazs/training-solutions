package week05d05;

import org.junit.jupiter.api.Test;
import week05d04.Product;
import week05d04.Store;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {

    @Test
    public void UserTestCreate() {

        User user = new User("Teszt", "Tamara", "rtz@sdf.hu");
        assertTrue("Teszt Tamara".equals(user.getFullName()));
        //System.out.println(user.getFullName());

    }
}
