package week05d04;

import com.sun.source.tree.AssertTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StoreTest {

    @Test
    public void StoreTestCreate() {

        Store store = new Store();
        Product product = new Product("Tehen", 2020, 11, 27);
        store.addProduct(new Product("Csiga", 2020, 05, 2));
        store.addProduct(new Product("Csiga2", 2020, 03, 2));

        assertTrue(2==store.getNumberOfExpired());

    }

}
