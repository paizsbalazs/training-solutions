package week05d04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> p = new ArrayList();

    public void addProduct(Product termek) {
        p.add(termek);
    }

    public int getNumberOfExpired() {
        int expired = 0;

        for (Product actual : p) {
            if (actual.getExpire().isBefore(LocalDate.now())) {
                expired++;
            };
        }

        return expired;
    }

}
