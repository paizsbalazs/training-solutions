package attributes.bill;

import java.util.ArrayList;
import java.util.List;

public class Bill {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public String calculateTotalPrice() {
        double total = 0;
        for ( Item i : items) {
            total = total + (i.getPrice() * i.getQuantity());
        }
        return "" + total;
    }
}
