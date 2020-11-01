package classsctructureconstructors;

public class StoreMain {

    public static void main(String[] args) {
        Store store = new Store("ALMA");
        store.store(1);

        Store store2 = new Store("KORTE");
        store2.dispatch(1);

        System.out.println(store.getProduct() + ": " + store.getStock() + " - " + store2.getProduct() + ": " + store2.getStock());

    }
}
