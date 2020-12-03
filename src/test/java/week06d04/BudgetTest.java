package week06d04;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BudgetTest {

    @Test
    public void BudgetTestCreate() {

        Budget budget = new Budget(new ArrayList<>());
        budget.items.add(new Item(100, 11, "Teknos"));
        budget.items.add(new Item(100, 11, "Tehen"));
        budget.items.add(new Item(100, 11, "Tigris"));

        assertEquals(3, budget.getItemsByMonth(11).size());
        assertEquals("Tehen", budget.getItemsByMonth(11).get(1).getName());

    }
}
