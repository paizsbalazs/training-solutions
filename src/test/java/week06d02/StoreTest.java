package week06d02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StoreTest {

    @Test
    public void CreateStoreTest() {
        Store store = new Store(new ArrayList<>());
        store.products.add(new Product(Category.OTHER, "Teknos", 100));
        store.products.add(new Product(Category.FROZEN, "Tigris", 100));
        store.products.add(new Product(Category.FROZEN, "Telapo", 100));

        assertTrue(2 == store.getProductByCategoryName("FROZEN"));

    }
}
