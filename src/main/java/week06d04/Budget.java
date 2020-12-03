package week06d04;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Budget {

    List<Item> items = new ArrayList<>();

    public Budget(List<Item> items) {
        this.items = items;
    }

    public String getName(int j) {
        return this.items.get(j).getName();
    }

    public List<Item> getItemsByMonth(int honap) {
        List<Item> result = new ArrayList<>();

        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).getMonth()==honap) {
                result.add(this.items.get(i));
            }
        }

        return result;
    }

}