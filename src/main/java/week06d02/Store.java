package week06d02;

import jdk.jfr.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Store {

    public List<Product> products;

    public Store(List<Product> products) {
        this.products = products;
    }

    public int getProductByCategoryName(String categoryName) {
        int darab = 0;

        for (Product p : products) {
            if (p.getCategory().equals(categoryName)) {
                darab = darab + 1;
            }
        }
        return darab;
    }
}
