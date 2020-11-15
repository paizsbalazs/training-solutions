package attributes.bill;

public class BillMain {

    public static void main(String[] args) {

        Bill bill = new Bill();

        bill.addItem(new Item("Alma", 3, 100));
        bill.addItem(new Item("Korte", 4, 150));
        bill.addItem(new Item("Dio", 10, 1000));

        System.out.println(bill.calculateTotalPrice());

    }
}
